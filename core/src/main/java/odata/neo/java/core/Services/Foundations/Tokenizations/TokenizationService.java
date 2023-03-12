package odata.neo.java.core.Services.Foundations.Tokenizations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import odata.neo.java.core.Models.Tokens.Token;
import odata.neo.java.core.Models.Tokens.TokenType;
import odata.neo.java.core.Models.Tokens.Exceptions.NullOTokenQueryException;

public class TokenizationService implements ITokenizationService {
    
    
    private final char[] separatorChars = new char[] { '\'', ' ', '=', '\\' };

    
    public Token[] tokenize(String rawQuery) throws NullOTokenQueryException {
        validateOTokenQuery(rawQuery);

        return oTokenize(rawQuery, separatorChars).toArray(Token[]::new);

    }

    private static List<Token> oTokenize(String rawQuery, char[] separatorChars) {
        String remainingRawQuery = rawQuery;
        TokenType oTokenType = null;
        List<Token> tokenList = new ArrayList<>();

        while (remainingRawQuery.length() > 0) {
            String returnValue = remainingRawQuery;
            String nextRemainingValue = "";

            Integer index = StringUtils.indexOfAny(remainingRawQuery, separatorChars);

            if (index != -1) {
                int rangeIndex = getRangeIndex(index);
                returnValue = remainingRawQuery.substring(0, rangeIndex);
                nextRemainingValue = remainingRawQuery.substring(rangeIndex, remainingRawQuery.length());
            }

            remainingRawQuery = nextRemainingValue;

            for (char c : separatorChars) {
                for (char k : returnValue.toCharArray()) {
                    if (c == k) {
                        oTokenType = TokenType.Separator;
                    }
                }
            }

            if(oTokenType != TokenType.Separator) {
                oTokenType =TokenType.Word;
            }
            
            tokenList.add(new Token(oTokenType, returnValue));
        }
        return tokenList;
    }

    private static int getRangeIndex(int index) {
        if (index > 0) {
            return index;
        }

        return 1;
    }
    


    private void validateOTokenQuery(String rawQuery) throws NullOTokenQueryException {
        if (rawQuery == null) {
            throw new NullOTokenQueryException("null token");
        }
    }

}

package odata.neo.java.core.Services.Foundations.Tokenizations;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import odata.neo.java.core.Models.Tokens.Token;
import odata.neo.java.core.Models.Tokens.TokenType;
import odata.neo.java.core.Models.Tokens.Exceptions.NullOTokenQueryException;

public class TokenizationService extends BaseTokenizationService {
    
    
    private final char[] separatorChars = new char[] { '\'', ' ', '=', '\\', '(', ')', ',', '/', '?' };

    public Token[] tokenize(String rawQuery) throws NullOTokenQueryException {
        validateOTokenQuery(rawQuery);

        return oTokenize(rawQuery, separatorChars).toArray(Token[]::new);
    }

    private static List<Token> oTokenize(String rawQuery, char[] separatorChars) {
        String remainingRawQuery = rawQuery;
        TokenType oTokenType;
        List<Token> tokenList = new ArrayList<>();
        Token previousToken = null;

        while (remainingRawQuery.length() > 0) {
            String returnValue;
            String nextRemainingValue;

            Integer index = StringUtils.indexOfAny(remainingRawQuery, separatorChars);

            if (index != -1) {
                char separator = remainingRawQuery.charAt(index);
                returnValue = remainingRawQuery.substring(0, index);
                nextRemainingValue = remainingRawQuery.substring(index + 1);

                if (!returnValue.isEmpty()) {
                    Token token = new Token(TokenType.Word, returnValue);
                    token.setPreviousToken(previousToken);
                    tokenList.add(token);
                    previousToken = token;
                }
                Token separatorToken = new Token(TokenType.Separator, String.valueOf(separator));
                separatorToken.setPreviousToken(previousToken);
                tokenList.add(separatorToken);
                previousToken = separatorToken;
            } else {
                returnValue = remainingRawQuery;
                nextRemainingValue = "";
                Token token = new Token(TokenType.Word, returnValue);
                token.setPreviousToken(previousToken);
                tokenList.add(token);
            }

            remainingRawQuery = nextRemainingValue;
        }
        return tokenList;
    }

    private static int getRangeIndex(int index) {
        if (index > 0) {
            return index;
        }

        return 1;
    }
    

}

package org.odata.neo.java.core.Services.Foundations.Tokenizations;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.odata.neo.java.core.Models.Tokens.Token;
import org.odata.neo.java.core.Models.Tokens.TokenType;

public class TokenizationServiceImpl implements TokenizationService {

    final char[] separatorChars = {
        '\'', ' ', '=', '\\' 
    };

    public List<Token> tokenize(String rawQuery) {
        try {
            return oTokenize(rawQuery, separatorChars);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<Token> oTokenize(String rawQuery, char[] sepChars) {
        String remainingRawQuery = rawQuery;
        TokenType oTokenType = null;
        List<Token> tokenList = new ArrayList<>();

        while (remainingRawQuery.length() > 0) {
            String returnValue = remainingRawQuery;
            String nextRemainingValue = "";

            Integer index = StringUtils.indexOfAny(remainingRawQuery, sepChars);

            if (index != -1) {
                int rangeIndex = getRangeIndex(index);
                returnValue = remainingRawQuery.substring(0, rangeIndex);
                nextRemainingValue = remainingRawQuery.substring(rangeIndex, remainingRawQuery.length());
            }

            remainingRawQuery = nextRemainingValue;

            for (char c : sepChars) {
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
    
}


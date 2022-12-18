package org.odata.neo.java.core.Services.Foundations.Tokenizations;

import java.util.List;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;
import org.odata.neo.java.core.Models.Tokens.Token;

public class TokenizationServiceImpl implements TokenizationService {

    final Character[] separatorChars = new Character[] {
        '\'', ' ', '=', '\\' 
    };

    public Token[] tokenize(String rawQuery) {
        try {
            return 
        }
    }

    private static Iterable<Token> oTokenize(String rawQuery, Character[] sepChars) {
        String remainingRawQuery = rawQuery;
        Boolean notSepChar = false;

        

        while (remainingRawQuery.length() > 0) {
            String returnValue = remainingRawQuery;
            String nextRemainingValue = "";

            Integer index = StringUtils.indexOfAny(sepChars, null)
        }
    }

    private static Integer getRangeIndex(Integer index) {
        if (index > 0) {
            return index;
        }

        return 1;
    }
    
}

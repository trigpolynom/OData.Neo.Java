package org.odata.neo.java.core.Services.Foundations.Tokenizations;

import java.util.List;

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

    private static Iterable<Token> oTokenize(String rawQuery, List<Character> sepChars) {
        String remainingRawQuery = rawQuery;
        Boolean notSepChar = false;

        for (Character c : sepChars) {
            if (sepChars.contains(c)) {
                notSepChar = true;
            }

        }
    }
    
}

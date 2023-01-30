package org.odata.neo.parser.Services.Foundations.Tokenizations;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.odata.neo.parser.Models.Tokens.Token;

public class TokenizationServiceImplTest {
    
    @Test
    void whenProvideQueryThenTokenize() {
        String inputQuery = "http://www.example.com/odata/v1/$select=Name";
        TokenizationServiceImpl tokenizationService = new TokenizationServiceImpl();
        Iterable<Token> tokens = tokenizationService.tokenize(inputQuery);

        assertTrue(tokens != null);

    }
}

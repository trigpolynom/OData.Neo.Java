package org.odata.neo.java.core.Services.Foundations.Tokenizations;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.beans.Transient;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.odata.neo.java.core.Models.Tokens.Token;

public class TokenizationServiceImplTest {
    
    @Test
    void whenProvideQueryThenOTokenize() {
        String inputQuery = "$select=Name";
        TokenizationServiceImpl tokenizationService = new TokenizationServiceImpl();
        List<Token> tokens = tokenizationService.tokenize(inputQuery);

        assertTrue(tokens.size() > 0);
    }
}

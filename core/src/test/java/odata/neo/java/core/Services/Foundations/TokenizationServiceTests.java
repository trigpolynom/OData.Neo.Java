package odata.neo.java.core.Services.Foundations;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import odata.neo.java.core.Models.Tokens.Token;
import odata.neo.java.core.Models.Tokens.Exceptions.NullOTokenQueryException;
import odata.neo.java.core.Services.Foundations.Tokenizations.TokenizationService;

@SpringBootTest
public class TokenizationServiceTests {

    @Test
    void simpleSelectTest() throws NullOTokenQueryException {

        TokenizationService tokenizationService = new TokenizationService();
        
        String simpleQuery = "&$select=id,name,esmerelda";

        Token[] tokens = tokenizationService.tokenize(simpleQuery);

        assertTrue(tokens != null);



        
    }
    
}

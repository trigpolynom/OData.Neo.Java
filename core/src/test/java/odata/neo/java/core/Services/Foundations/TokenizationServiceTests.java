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
    void simpleTest() throws NullOTokenQueryException {

        TokenizationService tokenizationService = new TokenizationService();
        
        String simpleQuery = "$filter=id eq '1234'&$select=id";

        Token[] tokens = tokenizationService.tokenize(simpleQuery);

        assertTrue(tokens != null);



        
    }
    
}

package odata.neo.java.core.Services.Foundations;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import odata.neo.java.core.Models.OTokens.OToken;
import odata.neo.java.core.Models.OTokens.Exceptions.FailedOTokenServiceException;
import odata.neo.java.core.Models.ProjectedTokens.ProjectedToken;
import odata.neo.java.core.Models.ProjectedTokens.Exceptions.FailedProjectedTokenServiceException;
import odata.neo.java.core.Models.ProjectedTokens.Exceptions.NullProjectedTokenException;
import odata.neo.java.core.Models.Tokens.Token;
import odata.neo.java.core.Models.Tokens.Exceptions.NullOTokenQueryException;
import odata.neo.java.core.Services.Foundations.OTokenizations.OTokenizationService;
import odata.neo.java.core.Services.Foundations.Projections.ProjectionService;
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


    @Test
    void rawUrlTokenizationTest() throws NullOTokenQueryException {

        TokenizationService tokenizationService = new TokenizationService();

        String simpleUrl = "localhost:8081/odata/person(1)";

        Token[] tokens = tokenizationService.tokenize(simpleUrl);

        assertTrue(tokens != null);

    }


    @Test
    void rawUrlProjectionTest() throws NullProjectedTokenException, NullOTokenQueryException, FailedProjectedTokenServiceException {

        TokenizationService tokenizationService = new TokenizationService();
        ProjectionService projectionService = new ProjectionService();

        String simpleUrl = "localhost:8081/odata/person(1)";

        Token[] tokens = tokenizationService.tokenize(simpleUrl);
        ProjectedToken[] projectedTokens = projectionService.projectTokens(tokens);

        assertTrue(projectedTokens != null);

    }


    @Test
    void rawUrlOTokenizationTest() throws NullOTokenQueryException, FailedProjectedTokenServiceException, FailedOTokenServiceException {

        TokenizationService tokenizationService = new TokenizationService();
        ProjectionService projectionService = new ProjectionService();
        OTokenizationService oTokenizationService = new OTokenizationService();

        String simpleUrl = "localhost:8081/odata/person(1)";

        Token[] tokens = tokenizationService.tokenize(simpleUrl);
        ProjectedToken[] projectedTokens = projectionService.project(tokens);

        OToken[] oTokens = new OToken[projectedTokens.length];
        for (int i = 0; i < projectedTokens.length; i++) {
            oTokens[i] = new OToken();
            oTokens[i].setRawValue(projectedTokens[i].getRawValue());
            oTokens[i].setProjectedTokenType(projectedTokens[i].getProjectedTokenType());
        }
        OToken rootToken = oTokenizationService.oTokenize(oTokens);

        assertTrue(rootToken != null);

    }


    @Test
    void selectOTokenizationTest() throws NullOTokenQueryException, FailedProjectedTokenServiceException, FailedOTokenServiceException {

        TokenizationService tokenizationService = new TokenizationService();
        ProjectionService projectionService = new ProjectionService();
        OTokenizationService oTokenizationService = new OTokenizationService();

        String simpleUrl = "localhost:8081/odata/persons?$select=name";

        Token[] tokens = tokenizationService.tokenize(simpleUrl);
        ProjectedToken[] projectedTokens = projectionService.project(tokens);

        OToken[] oTokens = new OToken[projectedTokens.length];
        for (int i = 0; i < projectedTokens.length; i++) {
            oTokens[i] = new OToken();
            oTokens[i].setRawValue(projectedTokens[i].getRawValue());
            oTokens[i].setProjectedTokenType(projectedTokens[i].getProjectedTokenType());
        }
        OToken rootToken = oTokenizationService.oTokenize(oTokens);

        assertTrue(rootToken != null);

    }
    
}

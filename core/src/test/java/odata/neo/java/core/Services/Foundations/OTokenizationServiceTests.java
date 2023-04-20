package odata.neo.java.core.Services.Foundations;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import odata.neo.java.core.Models.OTokens.OToken;
import odata.neo.java.core.Models.OTokens.OTokenType;
import odata.neo.java.core.Models.OTokens.Exceptions.FailedOTokenServiceException;
import odata.neo.java.core.Models.ProjectedTokens.ProjectedTokenType;
import odata.neo.java.core.Services.Foundations.OTokenizations.OTokenizationService;

@SpringBootTest
public class OTokenizationServiceTests {

    @Test
    public void shouldOTokenize() throws FailedOTokenServiceException {

        OTokenizationService oTokenizationService = new OTokenizationService();

        OToken[] unidentifiedOTokens = {
            new OToken("$select", null, ProjectedTokenType.Keyword, null),
            new OToken("=", null, ProjectedTokenType.Equals, null),
            new OToken("Name", null, ProjectedTokenType.Property, null)
        };

        List<OToken> childrenOfexpectedToken = new ArrayList<>();
        List<OToken> childrenOfchildren = new ArrayList<>();

        childrenOfchildren.add(new OToken("Name", OTokenType.Property, ProjectedTokenType.Property, null));
        childrenOfexpectedToken.add(new OToken("$select", OTokenType.Select, ProjectedTokenType.Keyword, childrenOfchildren));

        OToken expectedToken = new OToken(null, OTokenType.Root, null, childrenOfexpectedToken);

        OToken[] inputTokens = unidentifiedOTokens;


        OToken actualToken = oTokenizationService.oTokenize(inputTokens);

        assertTrue(actualToken.children != null);
    

    }
    
}


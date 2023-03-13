package odata.neo.java.core.Services.Foundations;

import java.util.ArrayList;
import java.util.List;

import org.apache.olingo.netty.server.api.ODataNetty;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import odata.neo.java.core.Models.OTokens.OToken;
import odata.neo.java.core.Models.OTokens.OTokenType;
import odata.neo.java.core.Models.ProjectedTokens.ProjectedTokenType;
import odata.neo.java.core.Services.Foundations.OTokenizations.OTokenizationService;

@SpringBootTest
public class OTokenizationServiceTests {

    @Test
    public void shouldOTokenize() {

        OTokenizationService oTokenizationService = new OTokenizationService();

        OToken[] unidentifiedOTokens = {
            new OToken("$select", null, ProjectedTokenType.Keyword, null),
            new OToken("=", null, ProjectedTokenType.Equals, null),
            new OToken("Name", null, ProjectedTokenType.Property, null)
        };

        List<OToken> childrenOfexpectedToken = new ArrayList<>();

        childrenOfexpectedToken.add(new OToken("harold", OTokenType.Property, ProjectedTokenType.Property, null));

        OToken expectedToken = new OToken(null, OTokenType.Root, null, childrenOfexpectedToken);
    

    }
    
}


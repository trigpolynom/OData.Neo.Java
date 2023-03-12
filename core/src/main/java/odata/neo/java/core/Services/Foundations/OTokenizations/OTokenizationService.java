package odata.neo.java.core.Services.Foundations.OTokenizations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import odata.neo.java.core.Models.OTokens.OToken;
import odata.neo.java.core.Models.OTokens.OTokenType;
import odata.neo.java.core.Models.OTokens.Exceptions.FailedOTokenServiceException;
import odata.neo.java.core.Models.ProjectedTokens.ProjectedTokenType;

public class OTokenizationService extends IOTokenizationService {

    @Override
    public OToken oTokenize(OToken[] oTokens) throws FailedOTokenServiceException {

        try {
        
            validateOTokens(oTokens);

            OToken root = new OToken();
            root.setoTokenType(OTokenType.Root);
            root.setChildren(new ArrayList<OToken>());

            if (oTokens.length > 0) {
                processTokens(root, oTokens);
            }

            return root;

        } catch (Exception e) {
            throw new FailedOTokenServiceException("Failed otoken service error occurred, contact support");
        }

    

    }


    private void processTokens(OToken root, OToken[] oTokens) {
        OToken selectToken = oTokens[0];
        selectToken.setoTokenType(OTokenType.Select);

        root.getChildren().add(selectToken);
        selectToken.setChildren(new ArrayList<OToken>());

        List<OToken> tokens = Arrays.stream(oTokens)
                .skip(1)
                .filter(token -> token.getProjectedTokenType() != ProjectedTokenType.Equals)
                .peek(token -> token.setoTokenType(OTokenType.Property))
                .collect(Collectors.toList());

        selectToken.getChildren().addAll(tokens);
    }
    
}
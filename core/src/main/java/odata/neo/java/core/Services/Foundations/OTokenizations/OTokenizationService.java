package odata.neo.java.core.Services.Foundations.OTokenizations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import odata.neo.java.core.Models.OTokens.OToken;
import odata.neo.java.core.Models.OTokens.OTokenType;
import odata.neo.java.core.Models.OTokens.Exceptions.FailedOTokenServiceException;
import odata.neo.java.core.Models.ProjectedTokens.ProjectedTokenType;

public class OTokenizationService extends BaseOTokenizationService {

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
        OToken current = root;
        OToken entityToken = null;
    
        for (int i = 0; i < oTokens.length; i++) {
            OToken token = oTokens[i];
            ProjectedTokenType projectedTokenType = token.getProjectedTokenType();
    
            if (projectedTokenType == ProjectedTokenType.Entity) {
                entityToken = token;
                entityToken.setoTokenType(OTokenType.Entity);
                current.getChildren().add(entityToken);
                entityToken.setChildren(new ArrayList<OToken>());
            } else if (projectedTokenType == ProjectedTokenType.OpenParenthesis) {
                if (entityToken != null) {
                    OToken keyToken = oTokens[i + 1];
                    keyToken.setoTokenType(OTokenType.Key);
                    entityToken.getChildren().add(keyToken);
                    i += 2;
                }
            }
        }
    }
    

}

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
        OToken entityToken = oTokens[0];
        entityToken.setoTokenType(OTokenType.Entity);
        root.getChildren().add(entityToken);
    
        if (oTokens.length > 1 && oTokens[1].getProjectedTokenType() == ProjectedTokenType.OpenParenthesis) {
            OToken keyToken = oTokens[2];
            keyToken.setoTokenType(OTokenType.Key);
            entityToken.getChildren().add(keyToken);
        }
    }
    
    
}

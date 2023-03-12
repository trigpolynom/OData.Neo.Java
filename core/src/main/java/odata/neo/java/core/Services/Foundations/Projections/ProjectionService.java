package odata.neo.java.core.Services.Foundations.Projections;

import odata.neo.java.core.Models.ProjectedTokens.ProjectedToken;
import odata.neo.java.core.Models.ProjectedTokens.ProjectedTokenType;
import odata.neo.java.core.Models.ProjectedTokens.Exceptions.FailedProjectedTokenServiceException;

public class ProjectionService extends BaseProjectionService {

    public ProjectedToken[] projectTokens(ProjectedToken[] projectedTokens) throws FailedProjectedTokenServiceException {
        try {
            validateProjectedTokens(projectedTokens);
            
            for (ProjectedToken projectedToken : projectedTokens) {
                String rawValue = projectedToken.getRawValue();
                switch (rawValue) {
                    case "=":
                        projectedToken.setProjectedTokenType(ProjectedTokenType.Assignment);
                        break;
                    case " ":
                        projectedToken.setProjectedTokenType(ProjectedTokenType.Space);
                        break;
                    case "eq":
                        projectedToken.setProjectedTokenType(ProjectedTokenType.Equals);
                        break;
                    case ",":
                        projectedToken.setProjectedTokenType(ProjectedTokenType.Comma);
                        break;
                    default:
                        if (rawValue.startsWith("$")) {
                            projectedToken.setProjectedTokenType(ProjectedTokenType.Keyword);
                        } else {
                            projectedToken.setProjectedTokenType(ProjectedTokenType.Property);
                        }
                        break;
                }
            }
            
            return projectedTokens;
        } catch (Exception ex) {
            throw new FailedProjectedTokenServiceException("failed to project tokens");
        }
    }
    
    
}

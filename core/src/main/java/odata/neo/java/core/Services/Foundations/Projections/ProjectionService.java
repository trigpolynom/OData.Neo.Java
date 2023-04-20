package odata.neo.java.core.Services.Foundations.Projections;

import java.util.Arrays;

import odata.neo.java.core.Models.ProjectedTokens.ProjectedToken;
import odata.neo.java.core.Models.ProjectedTokens.ProjectedTokenType;
import odata.neo.java.core.Models.ProjectedTokens.Exceptions.FailedProjectedTokenServiceException;
import odata.neo.java.core.Models.Tokens.Token;

public class ProjectionService extends BaseProjectionService {

    public ProjectedToken[] projectTokens(Token[] tokens) throws FailedProjectedTokenServiceException {
        try {
            ProjectedToken[] projectedTokens = Arrays.stream(tokens)
                    .map(token -> new ProjectedToken(token.getValue()))
                    .toArray(ProjectedToken[]::new);

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
                    case "(":
                        projectedToken.setProjectedTokenType(ProjectedTokenType.OpenParenthesis);
                        break;
                    case ")":
                        projectedToken.setProjectedTokenType(ProjectedTokenType.CloseParenthesis);
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


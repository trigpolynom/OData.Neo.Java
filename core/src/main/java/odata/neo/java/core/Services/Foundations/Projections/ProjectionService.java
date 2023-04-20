package odata.neo.java.core.Services.Foundations.Projections;

import java.util.Arrays;
import java.util.stream.IntStream;

import odata.neo.java.core.Models.OTokens.OToken;
import odata.neo.java.core.Models.ProjectedTokens.ProjectedToken;
import odata.neo.java.core.Models.ProjectedTokens.ProjectedTokenType;
import odata.neo.java.core.Models.ProjectedTokens.Exceptions.FailedProjectedTokenServiceException;
import odata.neo.java.core.Models.Tokens.Token;
import odata.neo.java.core.Models.Tokens.TokenType;

public class ProjectionService extends BaseProjectionService {

    
    public ProjectedToken[] project(Token[] tokens) {
        return IntStream.range(0, tokens.length)
                .mapToObj(i -> project(tokens[i], i > 0 ? tokens[i - 1] : null))
                .toArray(ProjectedToken[]::new);
    }

    private ProjectedToken project(Token token, Token previousToken) {
        ProjectedToken projectedToken = new ProjectedToken();

        projectedToken.setRawValue(token.getValue());
        projectedToken.setTokenType(token.getType());

        switch (token.getType()) {
            case Separator:
                projectedToken.setProjectedTokenType(getSeparatorProjectedTokenType(token.getValue()));
                break;
            case Word:
                String tokenValue = token.getValue();
                if ("/odata".equals(tokenValue) || "odata".equals(tokenValue)) {
                    projectedToken.setProjectedTokenType(ProjectedTokenType.ODataService);
                } else if (previousToken != null && previousToken.getType() == TokenType.Separator && previousToken.getValue().equals("/")) {
                    if (previousToken.getValue().equals("/") && previousToken.getPreviousToken() != null && previousToken.getPreviousToken().getValue().equals("odata")) {
                        projectedToken.setProjectedTokenType(ProjectedTokenType.Entity);
                    } else {
                        projectedToken.setProjectedTokenType(ProjectedTokenType.Word);
                    }
                } else {
                    projectedToken.setProjectedTokenType(ProjectedTokenType.Word);
                }
                break;
            default:
                projectedToken.setProjectedTokenType(ProjectedTokenType.Unknown);
        }

        return projectedToken;
    }

    
    

    private ProjectedTokenType getSeparatorProjectedTokenType(String value) {
        switch (value) {
            case "(":
                return ProjectedTokenType.OpenParenthesis;
            case ")":
                return ProjectedTokenType.CloseParenthesis;
            default:
                return ProjectedTokenType.Separator;
        }
    }

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


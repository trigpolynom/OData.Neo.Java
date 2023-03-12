package odata.neo.java.core.Models.ProjectedTokens;

import odata.neo.java.core.Models.Tokens.TokenType;

public class ProjectedToken {

    public String rawValue;
    public TokenType tokenType;
    public ProjectedTokenType projectedTokenType;
    public String getRawValue() {
        return rawValue;
    }
    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }
    public TokenType getTokenType() {
        return tokenType;
    }
    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }
    public ProjectedTokenType getProjectedTokenType() {
        return projectedTokenType;
    }
    public void setProjectedTokenType(ProjectedTokenType projectedTokenType) {
        this.projectedTokenType = projectedTokenType;
    }

    
    
}

package org.odata.neo.parser.Models.ProjectedTokens;

import org.odata.neo.parser.Models.Tokens.TokenType;

public class ProjectedToken {

    public String rawValue;

    public TokenType tokenType;

    public ProjectedTokenType projectedType;

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

    public ProjectedTokenType getProjectedType() {
        return projectedType;
    }

    public void setProjectedType(ProjectedTokenType projectedType) {
        this.projectedType = projectedType;
    }

    

}

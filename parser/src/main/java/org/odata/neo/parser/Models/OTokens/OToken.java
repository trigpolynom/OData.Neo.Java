package org.odata.neo.parser.Models.OTokens;

import java.util.List;

import org.odata.neo.parser.Models.ProjectedTokens.ProjectedTokenType;

public class OToken {

    public String rawValue;

    public OTokenType type;

    public ProjectedTokenType projectedType;

    public List<OToken> children;

    public String getRawValue() {
        return rawValue;
    }

    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }

    public OTokenType getType() {
        return type;
    }

    public void setType(OTokenType type) {
        this.type = type;
    }

    public ProjectedTokenType getProjectedType() {
        return projectedType;
    }

    public void setProjectedType(ProjectedTokenType projectedType) {
        this.projectedType = projectedType;
    }

    public List<OToken> getChildren() {
        return children;
    }

    public void setChildren(List<OToken> children) {
        this.children = children;
    }

    
    
    
}

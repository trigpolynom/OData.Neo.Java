package odata.neo.java.core.Models.OTokens;

import java.util.List;

import odata.neo.java.core.Models.ProjectedTokens.ProjectedTokenType;

public class OToken {

    public String rawValue;
    public OTokenType oTokenType;
    public ProjectedTokenType projectedTokenType;
    public List<OToken> children;
    public String getRawValue() {
        return rawValue;
    }
    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }
    public OTokenType getoTokenType() {
        return oTokenType;
    }
    public void setoTokenType(OTokenType oTokenType) {
        this.oTokenType = oTokenType;
    }
    public ProjectedTokenType getProjectedTokenType() {
        return projectedTokenType;
    }
    public void setProjectedTokenType(ProjectedTokenType projectedTokenType) {
        this.projectedTokenType = projectedTokenType;
    }
    public List<OToken> getChildren() {
        return children;
    }
    public void setChildren(List<OToken> children) {
        this.children = children;
    }

    

    
}

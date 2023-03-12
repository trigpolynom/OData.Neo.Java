package odata.neo.java.core.Models.OAST;

import java.util.List;

import odata.neo.java.core.Models.OTokens.OToken;
import odata.neo.java.core.Models.OTokens.OTokenType;

public class OAst {
    
    public OTokenType type;

    public List<OToken> properties;

    public OTokenType getType() {
        return type;
    }

    public void setType(OTokenType type) {
        this.type = type;
    }

    public List<OToken> getProperties() {
        return properties;
    }

    public void setProperties(List<OToken> properties) {
        this.properties = properties;
    }



}

package org.odata.neo.java.core.Models.OExpressions;


import org.odata.neo.java.core.Models.OTokens.OToken;

public class OExpression {

    public OToken oToken;

    public String rawQuery;

    public OToken getoToken() {
        return oToken;
    }

    public void setoToken(OToken oToken) {
        this.oToken = oToken;
    }

    public String getRawQuery() {
        return rawQuery;
    }

    public void setRawQuery(String rawQuery) {
        this.rawQuery = rawQuery;
    }

    
    
}

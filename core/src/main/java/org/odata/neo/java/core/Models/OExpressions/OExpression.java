package org.odata.neo.java.core.Models.OExpressions;

import java.beans.Expression;

import org.odata.neo.java.core.Models.OTokens.OToken;

public class OExpression {

    public OToken oToken;

    public Expression expression;

    public String rawQuery;

    public OToken getoToken() {
        return oToken;
    }

    public void setoToken(OToken oToken) {
        this.oToken = oToken;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getRawQuery() {
        return rawQuery;
    }

    public void setRawQuery(String rawQuery) {
        this.rawQuery = rawQuery;
    }

    
    
}

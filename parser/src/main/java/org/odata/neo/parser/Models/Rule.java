package org.odata.neo.parser.Models;

public class Rule extends Expression {

    private final String name;
    private final Expression expression;

    public Rule(String name, Expression expression) {
        this.name = name;
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }
    
}

package org.odata.neo.parser.Models;

import java.util.List;

public class Alternatives extends Expression {

    private final List<Expression> expressions;

    public Alternatives(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }
    
}

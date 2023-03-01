package org.odata.neo.parser.Models;

import java.util.List;

public class Sequence extends Expression {

    private final List<Expression> expressions;

    public Sequence(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }
    
}

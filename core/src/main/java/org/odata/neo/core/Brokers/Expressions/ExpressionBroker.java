package org.odata.neo.core.Brokers.Expressions;

import java.beans.Expression;
import java.util.concurrent.Future;

public interface ExpressionBroker {

    public <T> Future<Expression> generateExpressionAsync(String expression);
    
}

package org.odata.neo.java.core.Brokers.Expressions;

import java.util.concurrent.FutureTask;

public interface ExpressionBroker {

    <T> FutureTask<T> generateExpressionAsync(String expression);
    
}

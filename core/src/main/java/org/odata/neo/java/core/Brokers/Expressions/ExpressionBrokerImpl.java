package org.odata.neo.java.core.Brokers.Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;

import org.odata.neo.java.core.Models.Expressions.Globals;

public class ExpressionBrokerImpl implements ExpressionBroker{

    @Override
    public <T> FutureTask<T> generateExpressionAsync(String expression) {
        
        Globals<T> globals = getGlobalVariables
    }

    private <T> Globals<T> getGlobalVariables() {
        return new Globals() {
            List<T> dataSource = new ArrayList<T>();
            dataSource = dataSource.stream();
        };
    }
    
}

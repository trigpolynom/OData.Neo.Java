package odata.neo.java.core.Brokers.AST;

import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.JsonProcessingException;

import odata.neo.java.core.Models.OAST.OAst;

public abstract class BaseAbstractAstBroker {

    public abstract CompletableFuture<String> generateAstJSONAsync(OAst oAst) throws JsonProcessingException;
    
}

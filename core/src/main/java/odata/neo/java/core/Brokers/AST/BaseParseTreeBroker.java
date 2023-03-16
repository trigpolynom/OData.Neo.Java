package odata.neo.java.core.Brokers.AST;

import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.JsonProcessingException;

import odata.neo.java.core.Models.OParseTree.OParseTree;

public abstract class BaseParseTreeBroker {

    public abstract CompletableFuture<String> generateAstJSONAsync(OParseTree OParseTree) throws JsonProcessingException;
    
}

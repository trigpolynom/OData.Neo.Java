package odata.neo.java.core.Brokers.AST;

import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import odata.neo.java.core.Models.OParseTree.OParseTree;

public class ParseTreeBroker extends BaseParseTreeBroker {

    @Override
    public CompletableFuture<String> generateAstJSONAsync(OParseTree OParseTree) throws JsonProcessingException {
        
        CompletableFuture<String> futureString = new CompletableFuture<>();
        
        ObjectMapper mapper = new ObjectMapper();

        String astJson = mapper.writeValueAsString(OParseTree);

        futureString.complete(astJson);

        return futureString;

    }

    
}

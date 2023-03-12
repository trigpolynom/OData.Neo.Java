package odata.neo.java.core.Brokers.AST;

import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import odata.neo.java.core.Models.OAST.OAst;

public class AstBroker extends BaseAbstractAstBroker {

    @Override
    public CompletableFuture<String> generateAstJSONAsync(OAst oAst) throws JsonProcessingException {
        
        CompletableFuture<String> futureString = new CompletableFuture<>();
        
        ObjectMapper mapper = new ObjectMapper();

        String astJson = mapper.writeValueAsString(oAst);

        futureString.complete(astJson);

        return futureString;

    }

    
}

package odata.neo.java.core.Services.Foundations.OParseTree;

import java.util.concurrent.CompletableFuture;

import odata.neo.java.core.Models.OParseTree.OParseTree;
import odata.neo.java.core.Models.OTokens.OToken;

public abstract class BaseOParseTreeService {

    public abstract CompletableFuture<OParseTree> generateOParseTree(OToken oToken);
    
}

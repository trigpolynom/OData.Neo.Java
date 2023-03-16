package odata.neo.java.core.Services.Foundations.OParseTree;

import java.util.concurrent.CompletableFuture;

import odata.neo.java.core.Brokers.AST.ParseTreeBroker;
import odata.neo.java.core.Models.OParseTree.OParseTree;
import odata.neo.java.core.Models.OTokens.OToken;

public class OParseTreeService extends BaseOParseTreeService {

    private ParseTreeBroker parseTreeBroker;

    public OParseTreeService(ParseTreeBroker parseTreeBroker) {
        this.parseTreeBroker = parseTreeBroker;
    }

    @Override
    public CompletableFuture<OParseTree> generateOParseTree(OToken oToken) {
        return null;
    }
    
}

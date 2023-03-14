package odata.neo.java.core.Services.Foundations.OAst;

import java.util.concurrent.CompletableFuture;

import odata.neo.java.core.Models.OAST.OAst;
import odata.neo.java.core.Models.OTokens.OToken;

public abstract class BaseOAstService {

    public abstract CompletableFuture<OAst> generateOAst(OToken oToken);
    
}

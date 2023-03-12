package odata.neo.java.core.Services.Foundations.Tokenizations;

import odata.neo.java.core.Models.Tokens.Token;
import odata.neo.java.core.Models.Tokens.Exceptions.NullOTokenQueryException;

public interface ITokenizationService {

    public Token[] tokenize(String rawQuery) throws NullOTokenQueryException;
    
}

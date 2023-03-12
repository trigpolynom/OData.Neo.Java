package odata.neo.java.core.Services.Foundations.Tokenizations;

import odata.neo.java.core.Models.Tokens.Token;
import odata.neo.java.core.Models.Tokens.Exceptions.NullOTokenQueryException;

public abstract class ITokenizationService {

    public abstract Token[] tokenize(String rawQuery) throws NullOTokenQueryException;
    
    public void validateOTokenQuery(String rawQuery) throws NullOTokenQueryException {
        if (rawQuery == null) {
            throw new NullOTokenQueryException("null token");
        }
    }
}

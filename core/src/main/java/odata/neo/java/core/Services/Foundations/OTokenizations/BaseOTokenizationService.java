package odata.neo.java.core.Services.Foundations.OTokenizations;

import odata.neo.java.core.Models.OTokens.OToken;
import odata.neo.java.core.Models.OTokens.Exceptions.FailedOTokenServiceException;
import odata.neo.java.core.Models.OTokens.Exceptions.NullOTokensException;

public abstract class BaseOTokenizationService {

    public abstract OToken oTokenize(OToken[] oTokens) throws FailedOTokenServiceException;

    public void validateOTokens(OToken[] oTokens) throws NullOTokensException {
        
        if (oTokens == null) {

                throw new NullOTokensException("OTokens are null");
        
        }
    }
    
}

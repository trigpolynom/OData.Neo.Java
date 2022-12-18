package org.odata.neo.java.core.Services.Foundations.Tokenizations;

import org.odata.neo.java.core.Models.Tokens.Token;

public interface TokenizationService {

    Token[] tokenize(String rawQuery);
    
}

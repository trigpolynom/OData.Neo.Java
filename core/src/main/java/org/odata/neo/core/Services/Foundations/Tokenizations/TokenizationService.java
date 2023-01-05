package org.odata.neo.core.Services.Foundations.Tokenizations;

import java.util.List;

import org.odata.neo.core.Models.Tokens.Token;

public interface TokenizationService {

    public Iterable<Token> tokenize(String rawQuery);
    
}

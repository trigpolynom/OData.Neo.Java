package org.odata.neo.java.core.Services.Foundations.Tokenizations;

import java.util.List;

import org.odata.neo.java.core.Models.Tokens.Token;

public interface TokenizationService {

    public List<Token> tokenize(String rawQuery);
    
}

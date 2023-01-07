package org.odata.neo.parser.Services.Foundations.Tokenizations;


import org.odata.neo.parser.Models.Tokens.Token;

public interface TokenizationService {

    public Iterable<Token> tokenize(String rawQuery);
    
}

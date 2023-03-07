package org.odata.neo.core.Services.Foundations.Parser;

import org.odata.neo.core.Models.Parser.ParseResult;

public interface Abnf {

    ParseResult parse(String input, String rule);
    boolean validate(String input, String rule);
    String serialize(ParseResult parseResult);
    
}

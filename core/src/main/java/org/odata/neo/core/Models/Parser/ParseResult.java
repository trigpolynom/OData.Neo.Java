package org.odata.neo.core.Models.Parser;

import java.util.List;

public class ParseResult {
    
    private final boolean success;
    private final ParseTree parseTree;
    private final List<String> errorMessages;

    public ParseResult(boolean success, ParseTree parseTree, List<String> errorMessages) {
        this.success = success;
        this.parseTree = parseTree;
        this.errorMessages = errorMessages;
    }

    public boolean isSuccess() {
        return success;
    }

    public ParseTree getParseTree() {
        return parseTree;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }
    
}

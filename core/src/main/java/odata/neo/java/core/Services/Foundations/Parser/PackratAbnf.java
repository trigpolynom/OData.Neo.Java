package odata.neo.java.core.Services.Foundations.Parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.odata.neo.core.Models.Parser.ParseResult;
import org.odata.neo.core.Models.Parser.ParseTree;

public class PackratAbnf implements Abnf {

    private final Map<String, Map<Integer, ParseResult>> memoizationTable;
    private final Map<String, Pattern> patternTable;

    public PackratAbnf(Map<String, String> rules) {
        memoizationTable = new HashMap<>();
        patternTable = new HashMap<>();
        for (Map.Entry<String, String> entry : rules.entrySet()) {
            patternTable.put(entry.getKey(), compileRule(entry.getKey(), entry.getValue()));
        }
    }

    @Override
    public ParseResult parse(String input, String rule) {
    // Check if the parse result for this rule and input is already in the memoization table
    Map<Integer, ParseResult> inputMap = memoizationTable.get(rule);
    if (inputMap != null && inputMap.containsKey(input.length())) {
        return inputMap.get(input.length());
    }

    // The parse result is not in the memoization table, so parse the input
    Pattern pattern = patternTable.get(rule);
    Matcher matcher = pattern.matcher(input);
    if (matcher.matches()) {
        ParseTree parseTree = new ParseTree(rule);
        for (int i = 1; i <= matcher.groupCount(); i++) {
            String groupValue = matcher.group(i);
            if (groupValue != null) {
                parseTree.addChild(new ParseTree("group" + i, groupValue));
            }
        }

        // Memoize the parse result for this rule and input
        if (inputMap == null) {
            inputMap = new HashMap<>();
            memoizationTable.put(rule, inputMap);
        }
        inputMap.put(input.length(), new ParseResult(true, parseTree, new ArrayList<>()));

        return new ParseResult(true, parseTree, new ArrayList<>());
    } else {
        return new ParseResult(false, new ParseTree(rule), Arrays.asList("Failed to parse input."));
    }
    }

    // @Override
    // public boolean validate(String input, String rule) {
    //     // ...
    // }

    // @Override
    // public String serialize(ParseResult parseResult) {
    //     // ...
    // }

    // Helper method to compile a rule definition into a regular expression pattern
    private Pattern compileRule(String name, String definition) {
        StringBuilder patternBuilder = new StringBuilder();
        patternBuilder.append("(?<");
        patternBuilder.append(name);
        patternBuilder.append(">");
    
        String[] terms = definition.split(" ");
        for (String term : terms) {
            if (term.startsWith("\"") && term.endsWith("\"")) {
                // This is a string literal, so we need to escape it and add it to the pattern
                String escaped = Pattern.quote(term.substring(1, term.length() - 1));
                patternBuilder.append(escaped);
            } else if (term.startsWith("<") && term.endsWith(">")) {
                // This is a non-terminal symbol, so we need to substitute it with a named group reference
                patternBuilder.append("(?<");
                patternBuilder.append(term.substring(1, term.length() - 1));
                patternBuilder.append(">[A-Za-z0-9]+)");
            } else {
                // This is a terminal symbol, so we can simply add it to the pattern
                patternBuilder.append(term);
            }
    
            patternBuilder.append(" ");
        }
    
        // Remove the trailing space and close the named group
        patternBuilder.deleteCharAt(patternBuilder.length() - 1);
        patternBuilder.append(")");
    
        // Compile the pattern and return it
        return Pattern.compile(patternBuilder.toString());
    }
    
}

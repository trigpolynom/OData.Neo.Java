package org.odata.neo.core.Services.Foundations.Parser;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.odata.neo.core.Models.Parser.ParseResult;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PackratAbnfTests {

    @Test
    public void testODataQueryParsing() {
        // Define the OData query to be parsed
        String query = "$filter=Name eq 'John' and Age lt 30";

        // Define the OData ABNF grammar rules
        Map<String, String> rules = new HashMap<>();
        rules.put("query", "select-stmt");
        rules.put("select-stmt", "'$filter=' boolean-literal");
        rules.put("boolean-literal", "comparison-literal (logical-operator comparison-literal)*");
        rules.put("comparison-literal", "string-literal / number-literal / boolean-literal");
        rules.put("logical-operator", "'and' / 'or'");
        rules.put("string-literal", "'\'' ([^'] / '\'\'')* '\''");
        rules.put("number-literal", "[minus] (int-part [frac] [exp] / point-float [exp] / digit+)");
        rules.put("int-part", "digit+");
        rules.put("frac", "'. ' digit+");
        rules.put("exp", "[eE] [minus / plus] digit+");
        rules.put("point-float", "digit+ '. ' digit+");
        rules.put("minus", "'-'");
        rules.put("plus", "'+'");
        rules.put("digit", "[0-9]");
        rules.put("identifier", "ALPHA *(ALPHA / DIGIT / '_')");
        rules.put("ALPHA", "[A-Za-z]");
        rules.put("DIGIT", "[0-9]");

        // Create a new PackratAbnf parser instance
        PackratAbnf parser = new PackratAbnf(rules);

        // Parse the OData query using the "query" rule
        ParseResult result = parser.parse(query, "query");

        // Check that the parsing was successful
        assertTrue(result.isSuccess());
    }
    
}

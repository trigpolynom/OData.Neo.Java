package org.odata.neo.parser.Services.Foundations.Tokenizations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

public class ODataParser {
    private final List<Token> tokens;
    private int pos;
    private final ObjectMapper mapper = new ObjectMapper();
    private final JsonNodeFactory nodeFactory = mapper.getNodeFactory();

    public ODataParser(List<Token> tokens) {
        this.tokens = tokens;
        this.pos = 0;
    }

    public ObjectNode parse() throws ParseException {
        return parseServiceOptions();
    }

    private ObjectNode parseServiceOptions() throws ParseException {
        ObjectNode serviceOptions = nodeFactory.objectNode();

        do {
            String name = parseServiceOptionName();
            match(TokenType.EQ);
            String value = parseServiceOptionValue();
            serviceOptions.put(name, value);
        } while (match(TokenType.COMMA));

        match(TokenType.EOF);
        return serviceOptions;
    }

    private String parseServiceOptionName() throws ParseException {
        if (match(TokenType.ID)) {
            return tokens.get(pos - 1).getValue();
        } else {
            error("Expected service option name");
            return null;
        }
    }

    private String parseServiceOptionValue() throws ParseException {
        if (match(TokenType.STRING)) {
            return tokens.get(pos - 1).getValue();
        } else if (match(TokenType.OPEN)) {
            ArrayNode array = parseArray();
            try {
                return mapper.writeValueAsString(array);
            } catch (JsonProcessingException e) {
                throw new ParseException("Error while parsing array: " + e.getMessage());
            }
        } else {
            error("Expected service option value");
            return null;
        }
    }

    private ArrayNode parseArray() throws ParseException {
        ArrayNode array = nodeFactory.arrayNode();

        do {
            if (match(TokenType.STRING)) {
                array.add(tokens.get(pos - 1).getValue());
            } else if (match(TokenType.NUMBER)) {
                array.add(Double.parseDouble(tokens.get(pos - 1).getValue()));
            } else if (match(TokenType.OPEN)) {
                array.add(parseArray());
            } else {
                error("Expected string, number, or array");
            }
        } while (match(TokenType.COMMA));

        match(TokenType.CLOSE);
        return array;
    }

    private boolean match(TokenType type) {
        if (pos < tokens.size() && tokens.get(pos).getType() == type) {
            pos++;
            return true;
        } else {
            return false;
        }
    }

    private void error(String message) throws ParseException {
        throw new ParseException(message);
    }
}

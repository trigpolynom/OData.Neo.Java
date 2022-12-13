package org.odata.neo.java.core.Models.Tokens;

public class Token {
    
    public TokenType type;

    public String value;

    public Token(TokenType _type, String _value) {
        type = _type;
        value = _value;
    }

    public TokenType getType() {
        return type;
    }

    public void setType(TokenType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

package odata.neo.java.core.Models.Tokens;

public class Token {
    
    public TokenType type;
    public String value;
    private Token previousToken;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
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

    public Token getPreviousToken() {
        return previousToken;
    }

    public void setPreviousToken(Token previousToken) {
        this.previousToken = previousToken;
    }
}

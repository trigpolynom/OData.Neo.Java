package odata.neo.java.lakehouse.Models.Messages;

public class Message implements BaseMessage {
    
    private final String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

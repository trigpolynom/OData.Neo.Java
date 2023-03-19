package odata.neo.java.lakehouse.Configuration.TestSubscribers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/test/subscribe")
public class TestWebSocketServer {

    private final List<String> messages = new ArrayList<>();

    private Session session;

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("Received message: " + message);
    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        System.out.println("WebSocket closed: " + closeReason);
    }

    public void close() throws IOException {
        if (session != null) {
            session.close();
        }
    }

    public List<String> getMessages() {
        return messages;
    }

    
}

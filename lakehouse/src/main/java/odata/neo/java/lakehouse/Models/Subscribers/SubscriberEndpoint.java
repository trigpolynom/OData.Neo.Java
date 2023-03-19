package odata.neo.java.lakehouse.Models.Subscribers;

import javax.websocket.CloseReason;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;

public class SubscriberEndpoint extends Endpoint {

    private final String target;

    public SubscriberEndpoint(String target) {
        this.target = target;
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        // do nothing
    }

    @Override
    public void onError(Session session, Throwable throwable) {
        // do nothing
    }

    @Override
    public void onClose(Session session, CloseReason closeReason) {
        // do nothing
    }
    
}

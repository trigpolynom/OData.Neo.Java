package odata.neo.java.lakehouse.Brokers.Events;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;
import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;
import odata.neo.java.lakehouse.Models.Subscribers.SubscriberEndpoint;



public class EventBroker extends BaseEventBroker {

    private final Map<BaseEvent, List<Session>> subscribers = new HashMap<>();
  
    private final WebSocketContainer container = ContainerProvider.getWebSocketContainer();
    @Override
    public void subscribe(Subscriber subscriber, BaseEvent event) throws DeploymentException, IOException {
        String target = subscriber.getTarget();
        Session session = container.connectToServer(new SubscriberEndpoint(target), URI.create(target));
        subscribers.computeIfAbsent(event, k -> new ArrayList<>()).add(session);
    }

    @Override
    public void unsubscribe(Subscriber subscriber, BaseEvent event) {
        List<Session> sessions = subscribers.get(event);
        if (sessions != null) {
            String target = subscriber.getTarget();
            sessions.removeIf(session -> session.getRequestURI().toString().equals(target));
        }
    }

    @Override
    public void notifySubscribers(BaseEvent event, BaseMessage message) throws IOException {
        List<Session> sessions = subscribers.get(event);
        if (sessions != null) {
            for (Session session : sessions) {
                session.getBasicRemote().sendText(message.getContent());
            }
        }
    }
    
}

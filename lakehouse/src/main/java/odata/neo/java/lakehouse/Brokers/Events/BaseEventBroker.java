package odata.neo.java.lakehouse.Brokers.Events;

import java.io.IOException;

import javax.websocket.DeploymentException;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;
import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;

public abstract class BaseEventBroker {
    
    public abstract void subscribe(Subscriber subscriber, BaseEvent event) throws DeploymentException, IOException;
    public abstract void unsubscribe(Subscriber subscriber, BaseEvent event);
    public abstract void notifySubscribers(BaseEvent event, BaseMessage message) throws IOException;

}
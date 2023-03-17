package odata.neo.java.lakehouse.Brokers.Events;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;
import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;

public abstract class BaseEventBroker {
    
    public abstract void subscribe(Subscriber subscriber, BaseEvent event);
    public abstract void unsubscribe(Subscriber subscriber, BaseEvent event);
    public abstract void notifySubscribers(BaseEvent event, BaseMessage message);

}
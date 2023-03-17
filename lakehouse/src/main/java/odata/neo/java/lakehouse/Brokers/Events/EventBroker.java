package odata.neo.java.lakehouse.Brokers.Events;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;
import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;

public class EventBroker extends BaseEventBroker {

    @Override
    public void subscribe(Subscriber subscriber, BaseEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subscribe'");
    }

    @Override
    public void unsubscribe(Subscriber subscriber, BaseEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unsubscribe'");
    }

    @Override
    public void notifySubscribers(BaseEvent event, BaseMessage message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifySubscribers'");
    }
    
}

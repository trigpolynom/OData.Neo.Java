package odata.neo.java.lakehouse.Services.Foundations.Subscriber;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;

public abstract class BaseSubscriberService<T> {

    public abstract void update(BaseEvent event, BaseMessage message);
    
}

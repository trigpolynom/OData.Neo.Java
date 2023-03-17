package odata.neo.java.lakehouse.Services.Foundations.Publisher;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;

public abstract class BasePublisherService {

    public abstract void publish(BaseEvent event, BaseMessage message);

}

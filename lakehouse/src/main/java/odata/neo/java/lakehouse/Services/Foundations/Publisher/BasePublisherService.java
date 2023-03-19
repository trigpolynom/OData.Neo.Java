package odata.neo.java.lakehouse.Services.Foundations.Publisher;

import java.io.IOException;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;

public abstract class BasePublisherService {

    public abstract void publish(BaseEvent event, BaseMessage message) throws IOException;

}

package odata.neo.java.lakehouse.Brokers.Events;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;

public interface EventListener {
    void onEvent(BaseEvent event, BaseMessage message);
}

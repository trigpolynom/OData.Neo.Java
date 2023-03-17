package odata.neo.java.lakehouse.Services.Foundations.Publisher;

import odata.neo.java.lakehouse.Brokers.Events.EventBroker;
import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;

public class PublisherService extends BasePublisherService {

    private EventBroker eventBroker;

    public PublisherService(EventBroker eventBroker) {
        this.eventBroker = eventBroker;
    }

    @Override
    public void publish(BaseEvent event, BaseMessage message) {
        
        
    }
    
}

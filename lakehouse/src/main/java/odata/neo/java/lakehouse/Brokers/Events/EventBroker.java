package odata.neo.java.lakehouse.Brokers.Events;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;
import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;



public class EventBroker extends BaseEventBroker {


    private RestTemplate restTemplate;

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }



    private final Map<BaseEvent, List<Subscriber>> subscribers = new HashMap<>();

    @Override
    public void subscribe(Subscriber subscriber, BaseEvent event) {
        subscribers.computeIfAbsent(event, k -> new ArrayList<>()).add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber, BaseEvent event) {
        List<Subscriber> eventSubscribers = subscribers.get(event);
        if (eventSubscribers != null) {
            eventSubscribers.remove(subscriber);
        }
    }

    @Override
    public void notifySubscribers(BaseEvent event, BaseMessage message) throws IOException {
        List<Subscriber> eventSubscribers = subscribers.get(event);
        if (eventSubscribers != null) {
            for (Subscriber subscriber : eventSubscribers) {
                if (subscriber instanceof EventListener) {
                    restTemplate.postForLocation(subscriber.getCallbackUrl(), message.getContent());
                }
            }
        }
    }

    
}

package odata.neo.java.lakehouse.Brokers.Events;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;
import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;



public class EventBroker extends BaseEventBroker {


    private final Map<BaseEvent, List<Subscriber>> subscribers = new HashMap<>();
    private final Map<BaseEvent, RestTemplate> restTemplates = new HashMap<>();

    public void setRestTemplate(BaseEvent event, RestTemplate restTemplate) {
        restTemplates.put(event, restTemplate);
    }

    public RestTemplate getRestTemplate(BaseEvent event) {
        return restTemplates.get(event);
    }


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
            RestTemplate restTemplate = getRestTemplate(event);
            if (restTemplate == null) {
                throw new IllegalStateException("RestTemplate not set for the event");
            }
            for (Subscriber subscriber : eventSubscribers) {
                Map<String, Object> payload = new HashMap<>();
                payload.put("eventType", event.getType());
                payload.put("content", message.getContent());
    
                ObjectMapper objectMapper = new ObjectMapper();
                String jsonString = objectMapper.writeValueAsString(payload);
    
                restTemplate.postForLocation(subscriber.getCallbackUrl(), jsonString);
            }
        }
    }

    
}

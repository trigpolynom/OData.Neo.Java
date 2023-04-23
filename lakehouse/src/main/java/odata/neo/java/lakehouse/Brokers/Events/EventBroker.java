package odata.neo.java.lakehouse.Brokers.Events;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Events.EventCategory;
import odata.neo.java.lakehouse.Models.Messages.BaseMessage;
import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;

public class EventBroker extends BaseEventBroker {

    private final Map<BaseEvent, SubmissionPublisher<BaseMessage>> eventPublishers = new HashMap<>();
    private final Map<BaseEvent, RestTemplate> restTemplates = new HashMap<>();
    private final Map<String, EventCategory> eventCategories = new HashMap<>();

    public void createEventCategory(String categoryName) {
        eventCategories.put(categoryName, new EventCategory());
    }

    public void addEventToCategory(String categoryName, BaseEvent event) {
        EventCategory eventCategory = eventCategories.get(categoryName);
        if (eventCategory != null) {
            eventCategory.addEvent(event);
            eventPublishers.put(event, new SubmissionPublisher<>());
        } else {
            throw new IllegalArgumentException("Event category not found: " + categoryName);
        }
    }

    public void setRestTemplate(BaseEvent event, RestTemplate restTemplate) {
        restTemplates.put(event, restTemplate);
    }

    public RestTemplate getRestTemplate(BaseEvent event) {
        return restTemplates.get(event);
    }

    @Override
    public void subscribe(Subscriber subscriber, BaseEvent event) {
        SubmissionPublisher<BaseMessage> publisher = eventPublishers.get(event);
        if (publisher != null) {
            publisher.subscribe(new Flow.Subscriber<>() {
                private Flow.Subscription subscription;

                @Override
                public void onSubscribe(Flow.Subscription subscription) {
                    this.subscription = subscription;
                    subscription.request(1);
                }

                @Override
                public void onNext(BaseMessage message) {
                    try {
                        notifySubscriber(subscriber, event, message);
                    } catch (IOException e) {
                        onError(e);
                    }
                    subscription.request(1);
                }

                @Override
                public void onError(Throwable throwable) {
                    throwable.printStackTrace();
                }

                @Override
                public void onComplete() {
                    System.out.println("Completed for subscriber: " + subscriber.getId());
                }
            });
        } else {
            throw new IllegalArgumentException("Event not found: " + event);
        }
    }

    @Override
    public void unsubscribe(Subscriber subscriber, BaseEvent event) {
        // Unsubscribing is handled automatically by the Flow API when the subscriber cancels the subscription
    }

    public void publishEvent(BaseEvent event, BaseMessage message) {
        SubmissionPublisher<BaseMessage> publisher = eventPublishers.get(event);
        if (publisher != null) {
            publisher.submit(message);
        } else {
            throw new IllegalArgumentException("Event not found: " + event);
        }
    }

    private void notifySubscriber(Subscriber subscriber, BaseEvent event, BaseMessage message) throws IOException {
        RestTemplate restTemplate = getRestTemplate(event);
        if (restTemplate == null) {
            throw new IllegalStateException("RestTemplate not set for the event");
        }

        Map<String, Object> payload = new HashMap<>();
        payload.put("eventType", event.getType());
        payload.put("content", message.getContent());
        payload.put("subscriberId", subscriber.getId());
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(payload);
    
        restTemplate.postForLocation(subscriber.getCallbackUrl(), jsonString);
    }
    
    // Close publishers to complete the subscriptions when the broker is no longer needed
    public void closeEventPublishers() {
        eventPublishers.values().forEach(SubmissionPublisher::close);
    }
}


package odata.neo.java.lakehouse.UnitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;
import odata.neo.java.lakehouse.Brokers.Events.*;
import odata.neo.java.lakehouse.Models.Events.*;
import odata.neo.java.lakehouse.Models.Messages.*;
import odata.neo.java.lakehouse.Models.Subscribers.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

public class EventBrokerTest {

    private EventBroker eventBroker;
    private RestTemplate restTemplate;

    @BeforeEach
    public void setUp() {
        eventBroker = new EventBroker();
        restTemplate = Mockito.mock(RestTemplate.class);
        eventBroker.setRestTemplate(restTemplate);
    }

    @Test
    public void testSubscribeUnsubscribeAndNotifySubscribers() throws IOException, URISyntaxException {
        // Create a sample event and message
        BaseEvent event = new ODataRequestEvent(null);
        BaseMessage message = new Message("Test message");

        // Create a sample subscriber
        Subscriber subscriber = new Subscriber("1", "EventListener", new URI("http://localhost/callback"));

        // Subscribe the subscriber to the event
        eventBroker.subscribe(subscriber, event);

        // Notify the subscribers and verify that the restTemplate is called with the correct callback URL and content
        eventBroker.notifySubscribers(event, message);
        verify(restTemplate, times(1)).postForLocation(subscriber.getCallbackUrl(), message.getContent());

        // Unsubscribe the subscriber from the event
        eventBroker.unsubscribe(subscriber, event);

        // Notify the subscribers again and verify that the restTemplate is not called anymore
        eventBroker.notifySubscribers(event, message);
        verify(restTemplate, times(1)).postForLocation(subscriber.getCallbackUrl(), message.getContent());
    }
}



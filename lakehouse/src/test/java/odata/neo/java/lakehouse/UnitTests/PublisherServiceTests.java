package odata.neo.java.lakehouse.UnitTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import odata.neo.java.core.Models.Requests.ODataRequest;
import odata.neo.java.lakehouse.Brokers.Events.EventBroker;
import odata.neo.java.lakehouse.Configuration.TestConfiguration;
import odata.neo.java.lakehouse.Configuration.TestEvents.TestEvent;
import odata.neo.java.lakehouse.Configuration.TestSubscribers.TestSubscriber;
import odata.neo.java.lakehouse.Configuration.TestSubscribers.TestWebSocketServer;
import odata.neo.java.lakehouse.Models.Events.ODataRequestEvent;
import odata.neo.java.lakehouse.Models.Messages.Message;
import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;
import odata.neo.java.lakehouse.Services.Foundations.Publisher.PublisherService;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TestConfiguration.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PublisherServiceTests {

    @Autowired
    private PublisherService publisherService;

    @Autowired
    private TestSubscriber testSubscriber;

    @Autowired
    private EventBroker eventBroker;

    @Test
    public void testPublishMessage() throws DeploymentException, IOException {
        // Create a test event and message
        TestEvent testEvent = new TestEvent("test-event");
        Message message = new Message("Hello, Test Client!");

        // Subscribe the test client
        eventBroker.subscribe(testSubscriber, testEvent);

        // Publish the message
        publisherService.publish(testEvent, message);

        // Verify that the TestSubscriber received the message
        assertTrue(testSubscriber.isMessageReceived());
    }


    // @BeforeEach
    // public void setup() throws Exception {
    //     eventBroker = new EventBroker();
    //     publisherService = new PublisherService(eventBroker);

    //     webSocketServer = new TestWebSocketServer();
    //     // ServerEndpointConfig endpointConfig = ServerEndpointConfig.Builder.create(TestWebSocketServer.class, "/test/subscribe").build();
    //     WebSocketContainer serverContainer = ContainerProvider.getWebSocketContainer();
    //     URI uri = new URI("ws://localhost:8080/test/subscribe");
    //     serverContainer.connectToServer(webSocketServer, uri);
    // }

    // @AfterEach
    // public void cleanup() throws Exception {
    //     webSocketServer.close();
    // }

    // @Test
    // public void testPublishAndSubscribe(@LocalServerPort int port) throws Exception {
    //     HttpServletRequest request = mock(HttpServletRequest.class);

    //     when(request.getQueryString()).thenReturn("$select=Name,Is,Clinton");
    //     ODataRequestEvent event = new ODataRequestEvent(new ODataRequest(request));
    //     Message message = new Message("Test message");

    //     String websocketEndpointUrl = "ws://localhost:" + port + "/test/subscribe";
    //     Subscriber subscriber = new Subscriber("test-subscriber", "ODataRequest", websocketEndpointUrl);
    //     eventBroker.subscribe(subscriber, event);

    //     publisherService.publish(event, message);

    //     List<String> receivedMessages = webSocketServer.getMessages();
    //     assertEquals(1, receivedMessages.size());
    //     assertEquals(message.getContent(), receivedMessages.get(0));
    // }
    
}

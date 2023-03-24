package odata.neo.java.lakehouse.EndToEndTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import javax.servlet.http.HttpServletRequest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import odata.neo.java.core.Models.Requests.ODataRequest;
import odata.neo.java.lakehouse.Brokers.Events.EventBroker;
import odata.neo.java.lakehouse.Configuration.TestSubscribers.TestSubscriber;
import odata.neo.java.lakehouse.Models.Events.BaseEvent;
import odata.neo.java.lakehouse.Models.Events.ODataRequestEvent;
import odata.neo.java.lakehouse.Services.Foundations.Publisher.PublisherService;

@ExtendWith(MockitoExtension.class)
public class PublisherServiceTests {

    @Test
    public void testSendUpdatesToSubscriber() throws IOException {
     // Prepare mock HttpServletRequest
     HttpServletRequest mockHttpServletRequest = mock(HttpServletRequest.class);
     when(mockHttpServletRequest.getReader()).thenReturn(new BufferedReader(new StringReader("Sample update data")));

     // Prepare mock ODataRequest
     ODataRequest mockODataRequest = new ODataRequest(mockHttpServletRequest);

     // Create a real EventBroker
     EventBroker eventBroker = new EventBroker();

     // Create an instance of PublisherService
     PublisherService publisherService = new PublisherService(eventBroker);

     // Create a TestSubscriber and subscribe it to the ODataRequestEvent
     TestSubscriber testSubscriber = new TestSubscriber();
     BaseEvent oDataRequestEvent = new ODataRequestEvent(mockODataRequest);
     eventBroker.subscribe(testSubscriber, oDataRequestEvent);

     // Publish the ODataRequestEvent
     publisherService.publish(oDataRequestEvent, null);

     // Unsubscribe the TestSubscriber
     eventBroker.unsubscribe(testSubscriber, oDataRequestEvent);

     // Verify that the test subscriber has received the update
     String expectedUpdate = "Sample update data";
     String actualUpdate = testSubscriber.getLastReceivedUpdate();
     assertEquals(expectedUpdate, actualUpdate, "Test subscriber should receive the mock update data");
    }
}

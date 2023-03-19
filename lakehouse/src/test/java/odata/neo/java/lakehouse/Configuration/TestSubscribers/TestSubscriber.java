package odata.neo.java.lakehouse.Configuration.TestSubscribers;

import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.stereotype.Component;

import odata.neo.java.lakehouse.Models.Messages.BaseMessage;
import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;

@Component
public class TestSubscriber extends Subscriber {

    private final AtomicBoolean messageReceived = new AtomicBoolean(false);

    public TestSubscriber() {
        super("test-client", "test-event", "localhost");
    }

    public void receiveMessage(BaseMessage message) {
        System.out.println("Test client received message: " + message.getContent());
        messageReceived.set(true);
    }

    public boolean isMessageReceived() {
        return messageReceived.get();
    }
    
}

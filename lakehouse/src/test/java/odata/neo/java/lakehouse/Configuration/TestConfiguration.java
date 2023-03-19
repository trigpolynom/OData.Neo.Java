package odata.neo.java.lakehouse.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import odata.neo.java.lakehouse.Brokers.Events.EventBroker;
import odata.neo.java.lakehouse.Configuration.TestSubscribers.TestSubscriber;
import odata.neo.java.lakehouse.Services.Foundations.Publisher.PublisherService;

@Configuration
public class TestConfiguration {

    @Bean
    public EventBroker eventBroker() {
        return new EventBroker();
    }

    @Bean
    public PublisherService publisherService(EventBroker eventBroker) {
        return new PublisherService(eventBroker);
    }

    @Bean
    public TestSubscriber testSubscriber() {
        return new TestSubscriber();
    }
    
}

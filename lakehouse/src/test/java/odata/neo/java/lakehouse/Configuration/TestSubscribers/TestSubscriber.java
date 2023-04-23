// package odata.neo.java.lakehouse.Configuration.TestSubscribers;

// import java.io.IOException;
// import java.net.URI;

// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import odata.neo.java.core.Models.Requests.ODataRequest;
// import odata.neo.java.lakehouse.Brokers.Events.EventListener;
// import odata.neo.java.lakehouse.Models.Events.BaseEvent;
// import odata.neo.java.lakehouse.Models.Events.ODataRequestEvent;
// import odata.neo.java.lakehouse.Models.Messages.BaseMessage;
// import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;

// @RestController
// @RequestMapping("/test-subscriber")
// public class TestSubscriber extends Subscriber implements EventListener {

//     private String lastReceivedUpdate;

//     public TestSubscriber() {
//         super("1", "Test", URI.create("http://localhost:8080/test-subscriber/receive-updates"));
//     }

//     @PostMapping("/receive-updates")
//     public void receiveUpdates(@RequestBody String updates) {
//         lastReceivedUpdate = updates;
//         // Process the updates received from the Lakehouse
//         System.out.println("Updates received: " + updates);
//     }

//     public String getLastReceivedUpdate() {
//         return lastReceivedUpdate;
//     }

//     // @Override
//     // public void onEvent(BaseEvent event, BaseMessage message) {
//     //     if (event instanceof ODataRequestEvent) {
//     //         ODataRequest request = ((ODataRequestEvent) event).getRequest();
//     //         try {
//     //             receiveUpdates(request.getReader().readLine());
//     //         } catch (IOException e) {
//     //             e.printStackTrace();
//     //         }
//     //     }
//     // }
// }

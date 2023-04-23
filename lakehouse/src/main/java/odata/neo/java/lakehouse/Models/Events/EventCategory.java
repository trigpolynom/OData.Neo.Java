package odata.neo.java.lakehouse.Models.Events;

import java.util.ArrayList;
import java.util.List;

public class EventCategory {
    private final List<BaseEvent> events = new ArrayList<>();

    public void addEvent(BaseEvent event) {
        events.add(event);
    }

    public List<BaseEvent> getEvents() {
        return events;
    }
}

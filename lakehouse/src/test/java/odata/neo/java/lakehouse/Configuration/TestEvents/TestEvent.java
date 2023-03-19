package odata.neo.java.lakehouse.Configuration.TestEvents;

import odata.neo.java.lakehouse.Models.Events.BaseEvent;

public class TestEvent implements BaseEvent {

    private String name;

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getType'");
    }

    public TestEvent(String name) {
        this.name = name;
    }


    
}

package odata.neo.java.lakehouse.Models.Events;

import odata.neo.java.core.Models.Requests.ODataRequest;

public class ODataRequestEvent implements BaseEvent {

    private ODataRequest request;

    public ODataRequestEvent(ODataRequest request) {
        this.request = request;
    }

    public ODataRequest getRequest() {
        return request;
    }

    @Override
    public String getType() {
        return "ODataRequest";
    }

    
}

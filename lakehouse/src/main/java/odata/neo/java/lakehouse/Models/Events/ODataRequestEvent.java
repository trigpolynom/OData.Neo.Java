package odata.neo.java.lakehouse.Models.Events;

import odata.neo.java.lakehouse.Models.Rest.ODataRestTemplate;


public class ODataRequestEvent implements BaseEvent {

    private ODataRestTemplate restTemplate;

    public ODataRequestEvent(ODataRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ODataRestTemplate getRestTemplate() {
        return restTemplate;
    }

    @Override
    public String getType() {
        return "ODataRequest";
    }
}
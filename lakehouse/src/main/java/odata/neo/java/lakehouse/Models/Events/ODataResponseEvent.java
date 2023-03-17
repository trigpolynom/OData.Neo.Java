package odata.neo.java.lakehouse.Models.Events;

import odata.neo.java.core.Models.Responses.ODataResponses.ODataResponse;

public class ODataResponseEvent {

    private ODataResponse response;

    public ODataResponseEvent(ODataResponse response) {
        this.response = response;
    }

    public ODataResponse getResponse() {
        return response;
    }

    
    
}

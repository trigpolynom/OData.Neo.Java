package odata.neo.java.lakehouse.Models.Subscribers;

import java.net.URI;

public class Subscriber {

    private String id;
    private String type;
    private URI callbackUrl;

    public Subscriber(String id, String type, URI callbackUrl) {
        this.id = id;
        this.type = type;
        this.callbackUrl = callbackUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

 
    public URI getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(URI callbackUrl) {
        this.callbackUrl = callbackUrl;
    }


    

}

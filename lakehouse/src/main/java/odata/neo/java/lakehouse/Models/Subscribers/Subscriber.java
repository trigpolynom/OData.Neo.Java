package odata.neo.java.lakehouse.Models.Subscribers;

public class Subscriber {

    private String id;
    private String type;
    private String callbackUrl;

    public Subscriber(String id, String type, String callbackUrl) {
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

 
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }


    

}

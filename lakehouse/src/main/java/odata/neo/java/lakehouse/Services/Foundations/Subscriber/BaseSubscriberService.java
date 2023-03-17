package odata.neo.java.lakehouse.Services.Foundations.Subscriber;

import odata.neo.java.lakehouse.Models.Subscribers.Subscriber;

public abstract class BaseSubscriberService<T> {

    public abstract void subscribe(Subscriber subscriber, T event);
    public abstract void update(T event);
    public abstract void unsubscribe(Subscriber subscriber, T event);
    
    
}

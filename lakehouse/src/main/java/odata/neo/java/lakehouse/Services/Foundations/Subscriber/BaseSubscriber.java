package odata.neo.java.lakehouse.Services.Foundations.Subscriber;

public abstract class BaseSubscriber<T> {

    public abstract void update(T event);
    
}

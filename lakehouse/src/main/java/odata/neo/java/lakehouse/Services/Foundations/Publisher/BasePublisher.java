package odata.neo.java.lakehouse.Services.Foundations.Publisher;

import java.util.HashSet;
import java.util.Set;

import odata.neo.java.lakehouse.Services.Foundations.Subscriber.BaseSubscriber;

public abstract class BasePublisher<T> {

    private Set<BaseSubscriber<T>> subscribers;

    public BasePublisher() {
        subscribers = new HashSet<>();
    }

    public void subscribe(BaseSubscriber<T> subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(BaseSubscriber<T> subscriber) {
        subscribers.remove(subscriber);
    }

    protected void notifySubscribers(T event) {
        for (BaseSubscriber<T> subscriber : subscribers) {
            subscriber.update(event);
        }
    }


}

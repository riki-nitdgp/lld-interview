package org.coding.designpatterns.observer;

import org.coding.designpatterns.observer.observe.EmailNotificationAlertObserver;
import org.coding.designpatterns.observer.observe.NotificationAlertObserver;
import org.coding.designpatterns.observer.observe.SmsNotificationAlertObserver;
import org.coding.designpatterns.observer.ovserveable.IphoneObservableImpl;
import org.coding.designpatterns.observer.ovserveable.StockObservable;

public class Store {

    public static void main(String args[]) {

        StockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailNotificationAlertObserver("rkmondal41@gmail.com",
                iphoneObservable);
        NotificationAlertObserver observer2 = new SmsNotificationAlertObserver("918250839085",
                iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(10);
    }
}

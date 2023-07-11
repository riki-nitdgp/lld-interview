package org.coding.designPatterns.observer;

import org.coding.designPatterns.observer.observe.EmailNotificationAlertObserver;
import org.coding.designPatterns.observer.observe.NotificationAlertObserver;
import org.coding.designPatterns.observer.observe.SmsNotificationAlertObserver;
import org.coding.designPatterns.observer.ovserveable.IphoneObservableImpl;
import org.coding.designPatterns.observer.ovserveable.StockObservable;

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

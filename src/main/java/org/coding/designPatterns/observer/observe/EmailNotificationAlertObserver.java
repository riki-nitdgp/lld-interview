package org.coding.designPatterns.observer.observe;

import org.coding.designPatterns.observer.ovserveable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver {
    String email ;
    StockObservable observable;

    public EmailNotificationAlertObserver(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendSms(email, "hurry up product in stock");
    }

    private void sendSms(String email, String message) {
        System.out.println("Sending Email to: "+email);
    }
}

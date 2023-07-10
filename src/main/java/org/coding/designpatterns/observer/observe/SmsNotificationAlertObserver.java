package org.coding.designpatterns.observer.observe;

import org.coding.designpatterns.observer.ovserveable.StockObservable;

public class SmsNotificationAlertObserver implements NotificationAlertObserver {

    String mobileNumber ;
    StockObservable observable;

    public SmsNotificationAlertObserver(String mobileNumber, StockObservable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendSms(mobileNumber, "hurry up product in stock");
    }

    private void sendSms(String mobileNumber, String message) {
        System.out.println("Sending SMS to: "+mobileNumber);
    }
}

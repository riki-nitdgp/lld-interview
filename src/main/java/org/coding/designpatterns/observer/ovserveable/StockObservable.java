package org.coding.designpatterns.observer.ovserveable;

import org.coding.designpatterns.observer.observe.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int count);

    public int getStockCount();
}

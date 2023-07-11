package org.coding.designPatterns.observer.ovserveable;

import org.coding.designPatterns.observer.observe.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int count);

    public int getStockCount();
}

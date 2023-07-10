package org.coding.design_patterns.observer.ovserveable;

import org.coding.design_patterns.observer.observe.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int count);

    public int getStockCount();
}

package org.coding.designpatterns.observer.ovserveable;

import org.coding.designpatterns.observer.observe.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer: observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int count) {
        if(stockCount==0) {
            notifySubscribers();
        }
        stockCount = stockCount + count;
        if (count ==0) {
            stockCount = 0;
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}

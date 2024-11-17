package SystemDesign.Pattern.ObserverPattern.observable;

import java.util.*;
import SystemDesign.Pattern.ObserverPattern.observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();

    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    public void setStockCount(int newStockAdded){
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;
    }

    public int getStockCount(){
        return stockCount;
    }
}

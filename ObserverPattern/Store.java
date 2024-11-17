package SystemDesign.Pattern.ObserverPattern;

import SystemDesign.Pattern.ObserverPattern.observable.IphoneObservableImpl;
import SystemDesign.Pattern.ObserverPattern.observable.StockObservable;
import SystemDesign.Pattern.ObserverPattern.observer.EmailAlertObserverImpl;
import SystemDesign.Pattern.ObserverPattern.observer.MobileAlertObserverImpl;
import SystemDesign.Pattern.ObserverPattern.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable iphonObservable = new IphoneObservableImpl();

        NotificationAlertObserver oberver1 = new EmailAlertObserverImpl("xyz@email.com", iphonObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz1@gmail.com", iphonObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("user_name", iphonObservable);

        iphonObservable.add(oberver1);
        iphonObservable.add(observer2);
        iphonObservable.add(observer3);

        iphonObservable.setStockCount(10);

    }
    
}

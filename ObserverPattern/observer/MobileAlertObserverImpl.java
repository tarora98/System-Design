package SystemDesign.Pattern.ObserverPattern.observer;

import SystemDesign.Pattern.ObserverPattern.observable.StockObservable;
import SystemDesign.Pattern.ObserverPattern.observer.NotificationAlertObserver;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMsgOverMobile(userName, "product is in stock hurry up");
    }

    private void sendMsgOverMobile(String username, String msg){
        System.out.println("msg send to: +"+ username);
    }
}

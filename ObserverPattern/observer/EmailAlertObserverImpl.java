package SystemDesign.Pattern.ObserverPattern.observer;

import SystemDesign.Pattern.ObserverPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    // constructor injection
    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update(){
        sendMail(emaiId, "product in Stock");
    }    

    private void sendMail(String emailId, String msg){
        System.out.println("mail sent to "+ emailId);
    }
    
}

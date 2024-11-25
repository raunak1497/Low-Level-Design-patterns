package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String username,StocksObservable observable){
        this.username = username;
        this.observable = observable;
    }

    public void update(){
        sendUpdateOnMobile(username,"product is in stock hurry up");
    }

    private void sendUpdateOnMobile(String username, String msg){
        System.out.println("Alert sent to user " + username);
    }
}

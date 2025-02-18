package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    private String username;
    private StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String username, StocksObservable stocksObservable) {
        this.username = username;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update(){
        sendUpdateOnMobile(username, "The product is back in stock");
    }

    private void sendUpdateOnMobile(String username, String message){
        System.out.println("Alert sent to user" + username + "with the following message: " + message );
    }
}

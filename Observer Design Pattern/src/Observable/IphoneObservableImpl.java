package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    private List<NotificationAlertObserver> observerList =  new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void addObserver(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public int getStockCount(){
        return stockCount;
    }

    @Override
    public void setStockCount(int newStockAdded){
        if(stockCount == 0 && newStockAdded > 0){
            notifyObservers();
        }
        stockCount = newStockAdded;
    }
}

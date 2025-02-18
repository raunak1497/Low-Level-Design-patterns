package Observable;

import Observer.NotificationAlertObserver;


public interface StocksObservable {

     void addObserver(NotificationAlertObserver observer);
     void removeObserver(NotificationAlertObserver observer);
     void notifyObservers();
     int getStockCount();
     void setStockCount(int newStockAdded);
}

import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("raunak1497@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("ronny1497",iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("georgian4165@gmail.com", iphoneStockObservable);

        iphoneStockObservable.addObserver(observer1);
        iphoneStockObservable.addObserver(observer2);
        iphoneStockObservable.addObserver(observer3);

        iphoneStockObservable.setStockCount(13);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);
    }
}

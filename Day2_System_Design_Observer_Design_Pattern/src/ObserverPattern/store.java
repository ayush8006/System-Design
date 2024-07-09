package ObserverPattern;

import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observable.iphoneObservableImpl;
import ObserverPattern.Observer.EmailAlertObserverImp;
import ObserverPattern.Observer.MobileAlertObserverImp;
import ObserverPattern.Observer.NotificationAlertObserver;

public class store {

    public static void main(String args[]){
        StockObservable iphoneStockObservable =new iphoneObservableImpl();

        NotificationAlertObserver observer1=new EmailAlertObserverImp("ayush@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2=new EmailAlertObserverImp("saksh@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3=new MobileAlertObserverImp("ayushgoyal",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(20);

    }
}

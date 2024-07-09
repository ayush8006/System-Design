package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class iphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver>observerList=new ArrayList<>();

    public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    public void setStockCount(int newStockAdded){
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount=newStockAdded;
    }

    public int getStockCount(){
        return stockCount;
    }
}

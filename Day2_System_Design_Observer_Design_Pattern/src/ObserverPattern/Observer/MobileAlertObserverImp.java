package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImp implements NotificationAlertObserver {
    String userName;

    StockObservable observable;

    public MobileAlertObserverImp(String userName, StockObservable observable) {

        this.observable = observable;
        this.userName = userName;

    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is in Stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("mail sent to :" + userName);

        //send the actual userName to the end user
    }
}

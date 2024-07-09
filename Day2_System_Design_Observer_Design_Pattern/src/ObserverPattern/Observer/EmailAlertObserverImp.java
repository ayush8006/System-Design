package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImp implements NotificationAlertObserver{

    String emailId;

    StockObservable observable;

    public EmailAlertObserverImp(String emailId,StockObservable observable){

        this.observable=observable;
        this.emailId=emailId;

    }

    @Override
    public void update(){
        sendMail(emailId,"Product is in Stock hurry up!");
    }

    private void sendMail(String emailId,String msg){
        System.out.println("mail sent to :" + emailId);

        //send the actual email to the end user
    }
}

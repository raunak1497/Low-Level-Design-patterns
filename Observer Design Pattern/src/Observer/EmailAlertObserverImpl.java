package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
   private String emailId;
   private StocksObservable stocksObservable;

   public EmailAlertObserverImpl(String emailId,StocksObservable stocksObservable) {
       this.emailId = emailId;
       this.stocksObservable = stocksObservable;
   }

   @Override
    public void update(){
       sendEmailUpdate(emailId, "The product is back in stock");
   }

   private void sendEmailUpdate(String emailId, String message){
       System.out.println("Sending email to " + emailId + "with the message" + message);
   }
}

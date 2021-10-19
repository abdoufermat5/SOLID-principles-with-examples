package DependencyInversionPrinciple;

//public class SmsService {
//    public void sendSms(){
//        System.out.println("Sms sent to the customer");
//    }
//}

import DependencyInversionPrinciple.solution.INotificationService;

public class SmsService implements INotificationService {
    // NO MORE NEEDED
    //    public void sendSms(){
    //        System.out.println("Sms sent to the customer");
    //    }

    @Override
    public void notifyCustomer() {
        System.out.println("Sms sent to the customer");
    }
}


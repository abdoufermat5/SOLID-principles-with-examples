package DependencyInversionPrinciple;

//public class MailService {
//    public void sendMail(){
//        System.out.println("Email sent to the customer");
//    }
//}

import DependencyInversionPrinciple.solution.INotificationService;

public class MailService implements INotificationService {
    // NO MORE NEEDED
    //    public void sendMail(){
    //        System.out.println("Email sent to the customer");
    //    }

    @Override
    public void notifyCustomer() {
        System.out.println("Email sent to the customer");
    }
}

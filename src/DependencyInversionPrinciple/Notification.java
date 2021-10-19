package DependencyInversionPrinciple;

//public class Notification {
//    /*
//     Here we need to create an instance of both
//     MailService and SmsService class
//    * */
//    private MailService mailService;
//    private SmsService smsService;
//
//    // then we have to create two constructor for both of them
//    Notification(MailService ms){
//        mailService = ms;
//    }
//
//    Notification(SmsService ss){
//        smsService=ss;
//    }
//
//    /* Suppose we add a new way of notifying end users
//    * we have to touch this code again*/
//    /* There is clearly a coupling*/
//
//    public void notifyCustomerByMail(){
//        mailService.sendMail();
//    }
//    public void notifyCustomerBySms(){
//        smsService.sendSms();
//    }
//
//}

import DependencyInversionPrinciple.solution.INotificationService;

public class Notification {
    INotificationService service;

    Notification(INotificationService s){
        service=s;
    }

    public void notifyCustomer() {
        service.notifyCustomer();
    }
}

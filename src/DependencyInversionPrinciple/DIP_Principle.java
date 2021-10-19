package DependencyInversionPrinciple;

public class DIP_Principle {
    public static void main(String[] args) {
        /* As you can see you need to pass an instance of depended class as parameter
        * this is a problem it violate the DIP principle*/
        // new Notification(new MailService()).notifyCustomerByMail();
        // new Notification(new SmsService()).notifyCustomerBySms();

        // it might look same but try to add a new way of notification
        // quite amazing right??
        // we are not touching the Notification class code
        new Notification(new MailService()).notifyCustomer();
        new Notification(new SmsService()).notifyCustomer();
    }
}

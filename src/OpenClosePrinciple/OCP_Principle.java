package OpenClosePrinciple;


import OpenClosePrinciple.solution.MailNotification;
import OpenClosePrinciple.solution.NotificationOCP;

public class OCP_Principle {
    public static void main(String[] args) {
        Notification.notifyCustomer(messageType.EMAIL, "Your order is ready checkout now!");
        Notification.notifyCustomer(messageType.SMS, "Your order is ready checkout now!");
        // new
        Notification.notifyCustomer(messageType.PUSH, "Your order is ready checkout now!");

        // better way with OCP principle
        NotificationOCP emailNotif = new MailNotification();
        NotificationOCP smsNotif = new MailNotification();
        NotificationOCP pushNotif = new MailNotification();

        emailNotif.notifyCustomer("Haha I think this one is better now");
    }
}

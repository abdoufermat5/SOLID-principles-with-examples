package OpenClosePrinciple.solution;

public class SMSNotification extends NotificationOCP{
    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("<SMS> Content: <-- " + messageBody + " -->");
    }
}

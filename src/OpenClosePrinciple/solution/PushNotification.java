package OpenClosePrinciple.solution;

public class PushNotification extends NotificationOCP{
    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("<PUSH> Content: <-- " + messageBody + " -->");
    }
}

package OpenClosePrinciple.solution;

public class MailNotification extends NotificationOCP{
    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("<MAIL> Content: <-- " + messageBody + " -->");
    }
}

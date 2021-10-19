package SingleResponsiblePrinciple;

public class MessageImpl implements IMessageService{
    @Override
    public void printMessage(String content) {
        System.out.println("the message: " + content);
    }

    @Override
    public void sentMessage(String content) {
        System.out.println("Message is sent < -- " + content + " -- >");
    }
}

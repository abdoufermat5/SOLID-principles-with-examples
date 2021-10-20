package SingleResponsibilityPrinciple;

public class MessageServiceImpl implements IContentService{

    String content;
    IMessageService service = new MessageImpl();

    @Override
    public void writeMessage(String msg) {
        content = msg;
        service.printMessage(content);
    }

    @Override
    public void replaceMessageContent(String source, String destination) {
        content = content.replace(source, destination);
        service.sentMessage(content);
    }
}

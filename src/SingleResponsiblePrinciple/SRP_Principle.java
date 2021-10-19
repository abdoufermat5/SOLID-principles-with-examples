package SingleResponsiblePrinciple;

public class SRP_Principle {
    public static void main(String[] args) {
        // the idea behind is to decouple the code / we break into smaller chunks
        IContentService service = new MessageServiceImpl();
        service.writeMessage("Hey boy please don't forgot to lock the door");
        service.replaceMessageContent("Hey", "Hello");
    }
}

package SingleResponsiblePrinciple;

public interface IContentService {
    // the only responsibility of this class is to modify the data
    void writeMessage(String msg);
    void replaceMessageContent(String source, String destination);
}

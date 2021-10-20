package SingleResponsibilityPrinciple;

public interface IMessageService {
    // the only responsibility of this class is to present the data
    void printMessage(String msg); // this method is really not needed here
    void sentMessage(String msg); // this method is really not needed here
}

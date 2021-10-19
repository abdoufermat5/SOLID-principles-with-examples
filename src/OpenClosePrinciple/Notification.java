package OpenClosePrinciple;

public class Notification {
    static String messageBody;
    /*Avec cette approche si on veut ajouter un autre type de notification
    * on est obligé de toucher au code de cette classe et ajouter une autre condition*/
    static public void notifyCustomer(messageType type, String message){
        if (type.equals(messageType.EMAIL)){
            System.out.println("<Email> Content: <-- " + message + " -->");
        }else if(type.equals(messageType.SMS)){
            System.out.println("<SMS> Content: <-- " + message + " -->");
        }
        // new
        else if(type.equals(messageType.PUSH)){
            System.out.println("<PUSH> Content: <-- " + message + " -->");
        }
    }
}

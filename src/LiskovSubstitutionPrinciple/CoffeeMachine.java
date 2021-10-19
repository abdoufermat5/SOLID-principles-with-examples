package LiskovSubstitutionPrinciple;
import LiskovSubstitutionPrinciple.solution.MachineLSP;

//public class CoffeeMachine extends Machine{
//    @Override
//    public void addMilk() {
//        // ici nous violons le principe LSP puisque cette classe n'est même pas sensé
//        // implémenter cette méthode
//        try{
//            throw new Exception("Not Supported operation!!");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void prepareDrink(){
//        System.out.println("Coffee is ready!!");
//    }
//}

public class CoffeeMachine extends MachineLSP {
    @Override
    public void prepareDrink(){
        System.out.println("Tea is ready");
    }
}

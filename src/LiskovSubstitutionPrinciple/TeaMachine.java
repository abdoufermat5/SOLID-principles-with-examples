package LiskovSubstitutionPrinciple;

import LiskovSubstitutionPrinciple.solution.MachineLSP;

//public class TeaMachine extends Machine {
//    @Override
//    public void addMilk() {
//        System.out.println("Milk added!");
//    }
//
//    @Override
//    public void prepareDrink(){
//        System.out.println("Tea is ready");
//    }
//}
public class TeaMachine extends MachineLSP {
    @Override
    public void addMilk() {
        System.out.println("Milk added!");
    }

    @Override
    public void prepareDrink(){
        System.out.println("Tea is ready");
    }
}

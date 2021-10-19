package InterfaceSegregationPrinciple;

import InterfaceSegregationPrinciple.solution.ICoffeeMachine;
import InterfaceSegregationPrinciple.solution.ITeaMachine;

public class ISP_Principle {
    public static void main(String[] args) {
        System.out.println("COFFEE MACHINE:");
        System.out.println("---------------------");
        ICoffeeMachine coffeeMachine = new CoffeeMachineImpl();
        coffeeMachine.prepareCoffee();
        System.out.println("---------------------");
        System.out.println("---------------------");

        System.out.println("TEA MACHINE:");
        System.out.println("---------------------");
        ITeaMachine teaMachine = new TeaMachineImpl();
        teaMachine.prepareTea();

        System.out.println("---------------------");
        System.out.println("---------------------");

        System.out.println("MULTI-TASK MACHINE:");
        System.out.println("---------------------");
        CoffeAndTeaMachine coffeAndTeaMachine = new CoffeAndTeaMachine();
        coffeAndTeaMachine.getState();
    }
}

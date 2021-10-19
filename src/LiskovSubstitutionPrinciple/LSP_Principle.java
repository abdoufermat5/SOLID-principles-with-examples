package LiskovSubstitutionPrinciple;

import LiskovSubstitutionPrinciple.solution.MachineLSP;

public class LSP_Principle {
    public static void main(String[] args) {
        MachineLSP coffeeMachine = new CoffeeMachine();
        coffeeMachine.prepareDrink();
        coffeeMachine.addMilk(); // will throw an error
    }
}

package InterfaceSegregationPrinciple;

import InterfaceSegregationPrinciple.solution.ICoffeeMachine;
import InterfaceSegregationPrinciple.solution.ITeaMachine;

public class CoffeAndTeaMachine implements ITeaMachine, ICoffeeMachine {

    @Override
    public void prepareCoffee() {
        System.out.println("Wait until I finish to prepare your coffee!");
    }

    @Override
    public void prepareTea() {
        System.out.println("Wait until I finish to prepare your tea!");
    }

    public void getState(){
        this.prepareTea();
        System.out.println("-------------then >>>");
        this.prepareTea();
    }
}

package InterfaceSegregationPrinciple;

//public class CoffeeMachineImpl implements DrinkMachine{
//    @Override
//    public void prepareCoffee() {
//        System.out.println("Wait until I finish to prepare your coffee!");
//    }
//
//    @Override
//    public void prepareTea() {
//        // Empty implementation because this method is useless here
//        // that's a problem we need to fix
//    }
//}

import InterfaceSegregationPrinciple.solution.ICoffeeMachine;

public class CoffeeMachineImpl implements ICoffeeMachine {
    @Override
    public void prepareCoffee() {
        System.out.println("Wait until I finish to prepare your coffee!");
    }
        /*    NO MORE NEEDED      */
//    @Override
//    public void prepareTea() {
//        // Empty implementation because this method is useless here
//        // that's a problem we need to fix
//    }
}

package InterfaceSegregationPrinciple;

//public class TeaMachineImpl implements DrinkMachine{
//
//    @Override
//    public void prepareCoffee() {
//        // Empty implementation because this method is useless here
//        // that's a problem we need to fix
//    }
//
//    @Override
//    public void prepareTea() {
//        System.out.println("Wait until I finish to prepare your tea!");
//    }
//}

import InterfaceSegregationPrinciple.solution.ITeaMachine;

public class TeaMachineImpl implements ITeaMachine {

    /*    NO MORE NEEDED      */
//    @Override
//    public void prepareCoffee() {
//        // Empty implementation because this method is useless here
//        // that's a problem we need to fix
//    }

    @Override
    public void prepareTea() {
        System.out.println("Wait until I finish to prepare your tea!");
    }
}


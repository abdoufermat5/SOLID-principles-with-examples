package InterfaceSegregationPrinciple;

public interface DrinkMachine {
    /* every class that implement this interface
    will have to implement these two methods*/
    /* ----------- SO HERE IS THE PROBLEM ------------*/
    void prepareCoffee();
    void prepareTea();
}

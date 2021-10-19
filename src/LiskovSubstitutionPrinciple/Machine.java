package LiskovSubstitutionPrinciple;

abstract class Machine {
    public void prepareDrink(){
        System.out.println("Drink prepared");
    }

    public abstract void addMilk();
}

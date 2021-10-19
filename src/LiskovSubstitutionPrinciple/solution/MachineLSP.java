package LiskovSubstitutionPrinciple.solution;

public abstract class MachineLSP {
    public void prepareDrink(){
        System.out.println("Drink prepared");
    }
    // cette fois ci nous allons rendre cette methode optionnelle
    // afin de respecter LSP
    public void addMilk(){
        System.out.println("Not supported operation");
    };
}

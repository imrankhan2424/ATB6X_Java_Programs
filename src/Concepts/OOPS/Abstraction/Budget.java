package Concepts.OOPS.Abstraction;

public class Budget extends Finance {
    @Override
    public void stock() {
        System.out.println("Budget Stocks");
    }

    public void printBudget(){
        System.out.println("Budget -- My Budget");
    }
}

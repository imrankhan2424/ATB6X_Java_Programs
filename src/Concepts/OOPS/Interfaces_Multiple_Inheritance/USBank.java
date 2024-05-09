package Concepts.OOPS.Interfaces_Multiple_Inheritance;

public interface USBank {
    int Min_Bal=1000;

    public void credit();
    public void debit();

    //no method body only method declaration
    //no static methods
    //no main method
    //variables are by default final and static -> USBank.Min_Bal
    //We cannot create object of interface
    //100% abstraction

}

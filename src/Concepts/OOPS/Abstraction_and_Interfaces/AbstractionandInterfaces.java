package Concepts.OOPS.Abstraction_and_Interfaces;

import Concepts.OOPS.Abstraction.Finance;
import Concepts.OOPS.Interfaces_Multiple_Inheritance.RBI;
import Concepts.OOPS.Interfaces_Multiple_Inheritance.USBank;

public class AbstractionandInterfaces extends Finance implements USBank, RBI {
    @Override //Finance abstract
    public void stock() {
        System.out.println("AbstractionandInterfaces - abstract - stock");
    }

    @Override //USBank interface
    public void credit() {
        System.out.println("AbstractionandInterfaces - interface - USBank - Credit");
    }

    @Override //USBank interface
    public void debit() {
        System.out.println("AbstractionandInterfaces - interface - USBank - Debit");
    }

    @Override //RBI interface
    public void loan() {
        System.out.println("AbstractionandInterfaces - interface - RBI - Loan");
    }

    public void child_method(){
        System.out.println("AbstractionandInterfaces - own unique method");
    }
}

package Concepts.OOPS.Abstraction_and_Interfaces;

import Concepts.OOPS.Abstraction.Finance;
import Concepts.OOPS.Abstraction_and_Interfaces.AbstractionandInterfaces;
import Concepts.OOPS.Interfaces_Multiple_Inheritance.RBI;
import Concepts.OOPS.Interfaces_Multiple_Inheritance.USBank;

public class Test_AbstractionandInterfaces {
    public static void main(String[] args) {
        AbstractionandInterfaces ab=new AbstractionandInterfaces();
        ab.credit();
        ab.debit();
        ab.loan();
        ab.stock();
        ab.child_method();

        //abstract class
        System.out.println("\nFinance Abstract Class");
        Finance f =new AbstractionandInterfaces();
        f.stock();
        f.broker();
        System.out.println(f.stockbudget);
        System.out.println(f.num_of_stocks);
        System.out.println(Finance.avg_price);

        //US Bank Interface
        System.out.println("\nUSBank Interface Class");
        USBank b=new AbstractionandInterfaces();
        b.debit();
        b.credit();
        System.out.println(USBank.Min_Bal);

        //RBI Bank Interface
        System.out.println("\nRBI Interface Class");
        RBI rbi=new AbstractionandInterfaces();
        rbi.loan();
    }
}

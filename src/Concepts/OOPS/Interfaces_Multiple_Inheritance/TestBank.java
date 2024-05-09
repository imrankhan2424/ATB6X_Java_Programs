package Concepts.OOPS.Interfaces_Multiple_Inheritance;
public class TestBank {
    public static void main(String[] args) {
        HDFCBank hdfcBank=new HDFCBank();
        hdfcBank.credit(); //overidden interface methodsf
        hdfcBank.debit(); //overidden interface methods
        hdfcBank.loan(); //overidden interface methods
        hdfcBank.insurance(); // own method
        System.out.println(USBank.Min_Bal); // Interface variable

        USBank b=new HDFCBank();
        b.credit();
        b.debit();
//        b.loan();  <- One Parent interface object cannot access another parent class methods
//        b.insurance(); <- Parent interface object cannot access child own methods

        /*

         */
    }
}

package Concepts.OOPS.Interfaces_Multiple_Inheritance;
public class HDFCBank implements USBank, RBI {
    // Multiple inheritance achieved through interface
    // implements -> Is a relationship

    //RBI Methods
    @Override
    public void loan() {
        System.out.println("HDFC -- loan");
    }

    //US Bank Methods
    @Override
    public void credit() {
        System.out.println("HDFC -- Credit");
    }

    @Override
    public void debit() {
        System.out.println("HDFC -- Debit");
    }

    //HDFC Own Methods
    public static void insurance(){
        System.out.println("HDFC -- Insurance");
    }
}

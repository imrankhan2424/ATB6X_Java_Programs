package Concepts.OOPS.Abstraction;

public abstract class Finance {
    public int stockbudget=5000;
    public final int num_of_stocks=2;
    public static int avg_price=250;

    public abstract void stock();

    public void broker(){
        System.out.println("Finance Broker - Zerodha");
    }
}

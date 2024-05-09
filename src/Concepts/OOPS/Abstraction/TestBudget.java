package Concepts.OOPS.Abstraction;

public class TestBudget {
    public static void main(String[] args) {
        Budget b=new Budget();
        System.out.println(b.num_of_stocks);
        System.out.println(b.stockbudget);
        System.out.println(Budget.avg_price);
        b.printBudget();

        Finance f=new Budget();
        f.stock();
        System.out.println(f.num_of_stocks);
        System.out.println(f.stockbudget);
        System.out.println(Budget.avg_price);
        //f.printBudget(); <- child  method
    }
}

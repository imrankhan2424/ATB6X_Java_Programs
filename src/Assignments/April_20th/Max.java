package Assignments.April_20th;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Find Maximum between a,b,c");
        System.out.print("Enter value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter value of b: ");
        int b=sc.nextInt();
        System.out.print("Enter value of c: ");
        int c=sc.nextInt();

        //Considering also a case in which two or more numbers have same value
        int max= a>=b ? (a>=c? a:c) : (b>=c ? b : c);
        System.out.println("Maximum between "+a+","+b+","+c+" is: "+max);
    }
}

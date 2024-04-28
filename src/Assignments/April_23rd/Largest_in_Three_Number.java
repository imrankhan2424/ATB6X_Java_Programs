package Assignments.April_23rd;

import java.util.Scanner;

public class Largest_in_Three_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Find Largest between a,b,c");
        System.out.print("Enter value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter value of b: ");
        int b=sc.nextInt();
        System.out.print("Enter value of c: ");
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a+" is Largest Number");
        }else if(b>=a && b>=c){
            System.out.println(b+" is Largest Number");
        }else{
            System.out.println(c+" is Largest Number");
        }
    }
}

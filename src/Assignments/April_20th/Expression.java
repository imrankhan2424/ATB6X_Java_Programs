package Assignments.April_20th;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculating value of expression cuberoot(x^2+y^2-|z|)");
        System.out.print("Enter value of x: ");
        double x= sc.nextDouble();
        System.out.print("Enter value of y: ");
        double y=sc.nextDouble();
        System.out.print("Enter value of z: ");
        double z=sc.nextDouble();

        double result=Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("Result of expression is: "+result);
        sc.close();
    }
}

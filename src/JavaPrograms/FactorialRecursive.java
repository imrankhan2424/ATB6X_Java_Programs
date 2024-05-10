package JavaPrograms;

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Factorial of "+num+" is: "+factorial(num));
    }

    private static int factorial(int num) {
        if(num==0)
            return 1;
        else
            return num*factorial(num-1);
    }
}

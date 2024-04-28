package Assignments.April_25th;

import java.util.Scanner;

public class Arithemetic_SwitchCase {
    public static void main(String[] args) {
        System.out.println("Arithemetic Operation on two user input values");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first input value");
        int i1=sc.nextInt();
        System.out.println("Enter second input value");
        int i2=sc.nextInt();
        System.out.println("Enter Arithemtic operation symbol that you want to perform");
        char operator=sc.next().charAt(0);
        double result;
        switch(operator){
            case '+' :
                result=i1+i2;
                System.out.println("Result="+result);
                break;
            case '-' :
                result=i1-i2;
                System.out.println("Result="+result);
                break;
            case '*' :
                result=i1*i2;
                System.out.println("Result="+result);
                break;
            case '/' :
                if(i2 != 0){
                    result= (double) i1 /i2;
                    System.out.println("Result="+result);
                } else {
                    System.out.println("Error! Dividing by zero is not allowed. Makes result Infinite.");
                }
                break;
            default:
                System.out.println("Invalid Arithemtic symbol");
        }
    }
}
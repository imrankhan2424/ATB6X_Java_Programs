package Assignments.April_23rd;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num= sc.nextInt();

        if(num<=0){
            System.out.println("Invalid Number");
        }
        else if(num%2==0){
            System.out.println("Number "+num+" is an even number");
        }
        else{
            System.out.println("Number "+num+" is an odd number");
        }
    }
}

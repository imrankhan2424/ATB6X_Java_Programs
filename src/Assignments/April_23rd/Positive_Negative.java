package Assignments.April_23rd;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num= sc.nextInt();

        if(num<0){
            System.out.println("Number "+num+" is an negative number");
        }
        else if(num>0){
            System.out.println("Number "+num+" is positive number");
        }
        else{
            System.out.println("Zero Number");
        }
    }
}

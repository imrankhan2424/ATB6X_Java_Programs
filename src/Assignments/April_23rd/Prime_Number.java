package Assignments.April_23rd;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it's prime or not:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        for (int i=2;i<=n/2;i++)
        {
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println(n+" is a Prime Number");
        }else {
            System.out.println(n+" is NOT a Prime Number");
        }
    }
}

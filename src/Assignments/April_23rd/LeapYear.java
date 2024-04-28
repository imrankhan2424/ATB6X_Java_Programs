package Assignments.April_23rd;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int year=sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Year "+year+" is a leap year");
        }else {
            System.out.println("Year "+year+" is NOT a leap year");
        }

    }
}

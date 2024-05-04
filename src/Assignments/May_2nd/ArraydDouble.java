package Assignments.May_2nd;

import java.util.Scanner;

public class ArraydDouble {
    public static void main(String[] args) {
        //Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter in your array:");
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" element in array:");
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[length];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i]*2;
            System.out.println("2x value of "+arr[i]+" is: "+arr2[i]);
        }
    }
}
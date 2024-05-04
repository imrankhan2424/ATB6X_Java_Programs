package Assignments.May_2nd;

import java.util.Scanner;

public class ArraysPrint {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter in your array:");
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" element in array:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
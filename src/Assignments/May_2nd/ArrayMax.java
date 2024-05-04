package Assignments.May_2nd;

import java.util.Scanner;

public class ArrayMax {
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
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        System.out.println("Maximum value in array is: "+max);
    }
}
package Assignments.May_4th;

import java.util.Scanner;

public class Array2DMax {
    public static void main(String[] args) {
//        Write - Java method to find the maximum value in a 2D array. - O/P - 9
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows in 2D array:");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns in 2D array:");
        int col=sc.nextInt();
        int[][] arr=new int[rows][col];

        System.out.println("Enter Elements in 2D Array");
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[1].length;j++){
                System.out.println("Enter value of "+(i+1)+"th row and "+(j+1)+"th column:");
                arr[i][j]=sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[1].length; j++) {
                max = Integer.max(max, arr[i][j]);
            }
        }
        System.out.println("Maximum value in array is: "+max);
    }
}

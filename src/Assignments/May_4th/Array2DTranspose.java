package Assignments.May_4th;

import java.util.Scanner;

public class Array2DTranspose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows in 2D array:");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns in 2D array:");
        int col=sc.nextInt();
        int[][] arr=new int[rows][col];

        System.out.println("\nEnter Elements in 2D Array");
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[1].length;j++){
                System.out.println("Enter value of "+(i+1)+"th row and "+(j+1)+"th column:");
                arr[i][j]=sc.nextInt();
            }
        }

        int[][] arr_transpose=new int[arr[1].length][arr.length];
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[1].length; j++) {
                arr_transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("\nOriginal Matrix:");
        printMatrix(arr);

        System.out.println("Transposed Matrix:");
        printMatrix(arr_transpose);

    }
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

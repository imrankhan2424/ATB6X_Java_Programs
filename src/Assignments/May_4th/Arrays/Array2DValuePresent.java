package Assignments.May_4th.Arrays;

import java.util.Scanner;

public class Array2DValuePresent {
    public static void main(String[] args) {
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

        System.out.println("Enter search value:");
        int search_value=sc.nextInt();
        int times=0;

        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[1].length; j++) {
                if(arr[i][j]==search_value){
                    System.out.println(search_value+" - "+times+"th instance is present at row "+(i+1)+" and column "+(j+1));
                    times++;
                }
            }
        }
        if(times==0)
            System.out.println("Element "+search_value+" is NOT present in array");
    }
}

package NaveenAutomation;

public class TwoDimensionalArrays {
    public static void main(String args[]){
        int a[][]=new int[3][5];

        System.out.println(a.length); //no. of rows
        System.out.println(a[0].length); // no. of columns

        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                a[i][j]=5;
            }
        }
    }
}

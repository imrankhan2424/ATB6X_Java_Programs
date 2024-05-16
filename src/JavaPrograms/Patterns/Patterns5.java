package JavaPrograms.Patterns;

import java.util.Arrays;
import java.util.Optional;

public class Patterns5 {
    public static void main(String[] args) {
        pattern51(5);
    }
    public static void pattern51(int n){
        int a=65;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print((char)(a+i-1)+" ");
            System.out.println();
        }
    }
}

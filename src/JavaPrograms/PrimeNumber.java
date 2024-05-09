package JavaPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if its prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPrime(num))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println("Not a Prime Number");
    }

    public static boolean isPrime(int num) {
        int count = 0;
        if (num <= 1) {
            return false;
        }
//        for(int i=2;i<=num;i++){
//            if(num%i==0){
//                count++;
//            }
//        }
//        if(count==1){
//            return true;
//        }else {
//            return false;
//        }
        for(int i=2;i<num;i++){
            if (num%i==0)
                return false;
        }
        return true;
    }
}

package JavaPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if its Palindrome or not");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPalindromenumber(num))
            System.out.println(num+ " is a Palindrome Number");
        else
            System.out.println(num+" is NOT a Palindrome Number");
    }

    private static boolean isPalindromenumber(int num) {
        int rev=0;
        int original_num=num;
        while(num!=0){
            rev=(rev*10)+(num%10);
            num=num/10;
        }
        System.out.println("Reverse: "+rev);
        if(rev==original_num)
            return true;
        else
            return false;
    }
}

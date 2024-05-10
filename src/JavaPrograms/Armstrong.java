package JavaPrograms;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if its Armstrong or not");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(isArmstrong(num))
            System.out.println(num+" is an Armstrong number");
        else
            System.out.println(num+" is NOT an Armstrong number");
    }

    private static boolean isArmstrong(int num) {
        int original_num=num;
        int result=0;
        while(num!=0){
            result=result+(int)Math.pow((num%10),3);
            num=num/10;
        }
        System.out.println("Result: "+result);
        if(result==original_num)
            return true;
        else
            return false;
    }
}

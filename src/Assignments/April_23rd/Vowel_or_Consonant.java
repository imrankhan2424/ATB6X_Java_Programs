package Assignments.April_23rd;

import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()>1){
            System.out.println("Looks like you entered a String: "+s);
            System.out.println("Taking first letter as input: "+s.charAt(0));
        }
        char c=s.charAt(0);

        if(c=='a'|| c=='e' || c=='i' || c=='o'|| c=='u' || c=='A'|| c=='E' || c=='I' || c=='O'|| c=='U'){
            System.out.println(c+" is a Vowel");
        }
        else{
            System.out.println(c+" is a consonant");
        }
    }
}

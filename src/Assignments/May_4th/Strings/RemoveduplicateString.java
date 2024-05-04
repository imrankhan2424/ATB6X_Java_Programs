package Assignments.May_4th.Strings;

import java.util.Scanner;

public class RemoveduplicateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to remove duplicate characters:");
        String s=sc.nextLine();
        StringBuilder trimmed_string=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            if(trimmed_string.indexOf(String.valueOf(k))==-1){
                trimmed_string.append(k);
            }
        }
        System.out.println("String after removing duplicates: "+trimmed_string);
    }
}

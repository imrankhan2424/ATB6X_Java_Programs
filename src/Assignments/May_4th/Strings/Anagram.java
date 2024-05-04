package Assignments.May_4th.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.nextLine();
        s1=s1.toLowerCase();
        System.out.println("Enter second string:");
        String s2 = sc.nextLine();
        s2=s2.toLowerCase();

        char[] arrayS1 = s1.toCharArray();
        char[] arrayS2 = s2.toCharArray();

        Arrays.sort(arrayS1);
        Arrays.sort(arrayS2);

        if (Arrays.equals(arrayS1, arrayS2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
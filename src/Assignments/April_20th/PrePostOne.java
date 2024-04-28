package Assignments.April_20th;

public class PrePostOne {
    public static void main(String[] args) {
        int a = 10;
        int result = (++a + a++ + a++);
        // Part one : ++a : result = 11 , current value of a = 11
        // Part two : a++ : result = 11+11, current value of a = 12
        // Part three: a++ : result = 11+11+12, current value of a = 13
        // Result = 11+11+12 = 34 , a = 13

        System.out.println("With a=10,\nValue of expression: ++a + a++ + a++ = " + result);
        System.out.println("Current value of a: "+a);
    }
}

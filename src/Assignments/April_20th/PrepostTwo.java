package Assignments.April_20th;

public class PrepostTwo {
    public static void main(String[] args) {
        int b = 10;
        int result = (--b + b++ + ++b);
        // Part one : --b : result = 9 , current value of a = 9
        // Part two : b++ : result = 9+9, current value of a = 10
        // Part three: ++b : result = 9+9+11, current value of a = 11
        // Result = 9+9+11 = 29 , b = 11

        System.out.println("With b=10,\nValue of expression: --b + b++ + ++b = " + result);
        System.out.println("Current value of b: "+b);
    }
}

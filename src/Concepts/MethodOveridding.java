package Concepts;

import Concepts.OOPS.Inheritance_and_Polymorphism.B;
public class MethodOveridding {
    public static void main(String[] args) {
        System.out.println("Method overriding - When same method is present in parent and child -> child function is called");
        B obj=new B();
        obj.test();
    }
}

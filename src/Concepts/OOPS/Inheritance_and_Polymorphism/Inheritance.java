package Concepts.OOPS.Inheritance_and_Polymorphism;

import Concepts.OOPS.Inheritance_and_Polymorphism.A;
import Concepts.OOPS.Inheritance_and_Polymorphism.B;

public class Inheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.test(); // Method overriding - When same method is present in parent and child -> child function is called
        obj.testB();
        System.out.println("Inheriting parent function from child");
        obj.testA();
        System.out.println("Using super to call methods from parent using child object");
//        obj.super_test();

        System.out.println("\nParent class object can only use its own member functions and not child's");
        A obj_A=new A();
        obj_A.test(); // parent Test method
        obj_A.test();

        //obj_A.testB();  Parent object cannot access child methods.
    }
}

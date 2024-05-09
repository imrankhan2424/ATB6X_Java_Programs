package Concepts.OOPS.Inheritance_and_Polymorphism;

import Concepts.OOPS.Inheritance_and_Polymorphism.A;

public class B extends A {
    // extends -> Has a relationship
    public void test(){
        System.out.println("Inside -- Class B");
    }

    public void testB(){
        System.out.println("Inside -- Class B -- testB");
    }

//    public void super_test(){
//        super.test(); // super keyword used to access parent method (Overridden Method)
//        super.testA(); // super keyword used to access parent method (Non-Overridden Method)
//    }

}

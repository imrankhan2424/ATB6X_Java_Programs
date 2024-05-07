package Concepts;

class A{
    public void test(){
        System.out.println("Inside -- Class A");
    }

    public void testA(){
        System.out.println("Inside -- Class A -- testA");
    }
}
class B extends A{
    public void test(){
        System.out.println("Inside -- Class B");
    }

    public void testB(){
        System.out.println("Inside -- Class B -- testB");
    }

    public void super_test(){
        super.test(); // super keyword used to access parent method (Overridden Method)
        super.testA(); // super keyword used to access parent method (Non-Overridden Method)
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.test(); // Method overriding - When same method is present in parent and child -> child function is called
        obj.testB();
        obj.testA();
        obj.super_test();

        System.out.println();
        A obj_A=new A();
        obj_A.test(); // parent Test method
        obj_A.test();

        //obj_A.testB();  Parent object cannot access child methods.
    }
}

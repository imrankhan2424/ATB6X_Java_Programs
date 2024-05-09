package Concepts.OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Static/Compile Time Polymorphism");
        //Compile Time Polymorphism - Static Polymorphism
        //Child methods + Overriden Method
        B objB=new B();
        objB.testB();
        objB.test();// Overrriden Method
        objB.testA();

        System.out.println("Dynamic/Run Time Polymorphism");
        //Run Time Polymorphism - Dynamic Polymorphism
        //Parent methods + Overriden Method
        A objA=new B(); //Upcasting
        objA.test();
        objA.testA();
        //objA.testB(); -> cannot access pure child method

        //B b=(B)new A(); // DownCasting - will throw ClassCastException
    }
}

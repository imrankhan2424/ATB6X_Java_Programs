package Concepts;

public class SingleTon {
    // SingleTon class is a class that has only one object
    // If multiple objects are created they are pointed to same reference variable

    // Concept useful in creating Driver Instance in Selenium
    // Link : https://www.youtube.com/watch?v=1mEWYPasgUc&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=23

    // Conditions for singleton Class
    // 1. private constructor of SingleTon Class
    // 2. public static method of getInstance() that has a return type of SingleTon class

    // For normal class we use constructor, whereas for Singleton class we use getInstance()

    public static SingleTon instance_variable=null;
    int i=0;
    private SingleTon(){
    }

    public static SingleTon getInstance(){
        if(instance_variable==null){
            instance_variable=new SingleTon();
        }
        return instance_variable;
    }

    public static void main(String[] args) {
        SingleTon s1=getInstance();
        SingleTon s2=getInstance();
        s1.i=10;

        System.out.println(s2.i);
    }
}

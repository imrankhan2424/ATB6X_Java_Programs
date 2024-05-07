package Concepts;
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Main method overloading");
        main("Inside main -- String");
        main(20);

        System.out.println("\nConstructor overloading");
        Overloading o=new Overloading();
        Overloading o1=new Overloading(20);
    }

    public static void main(String args) {
        System.out.println(args);
    }

    public static void main(int args) {
        System.out.println("Inside main -- Int - "+args);
    }

}
class Overloading{
    public Overloading(){
        System.out.println("Constructor Overloading - 0 arguments");
    }
    public Overloading(int i){
        System.out.println("Constructor Overloading - Integer argument -"+i);
    }
}

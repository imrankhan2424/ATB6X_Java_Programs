package Concepts.ListConcept;

import java.util.Collections;
import java.util.LinkedList;

public class LInkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> s= new LinkedList<>();
        s.add("Imran");
        s.add("Khan");
        s.add("When?");

        System.out.println(s);
        s.forEach(System.out::println);
        //s.forEach(item-> System.out.println(item));

        s.add("Hi");
        s.forEach(System.out::println);

        System.out.println("------------");

        LinkedList<String> k=new LinkedList<>();
        k.add("Bye");

        s.addAll(k);
        s.forEach(System.out::println);

        System.out.println("------------");
        s.remove(2);
        s.forEach(System.out::println);

        System.out.println("------------");
        Collections.sort(s);
        s.forEach(System.out::println);
    }
}

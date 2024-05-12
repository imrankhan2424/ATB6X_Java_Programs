package Concepts.SetConcept;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetConcept {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(10);hash.add(20);hash.add(30);
        hash.add(10);hash.add(20);hash.add(30);
        System.out.println(hash); //Automatically removes duplicate

        System.out.println("----------------");

        HashSet<Integer> hash2 = new HashSet<>();
        hash2.add(10);hash2.add(20);hash2.add(30);
        hash2.add(40);hash2.add(50);hash2.add(60);
        System.out.println(hash2);

        System.out.println("-------AsArrayList---------");

        HashSet<String> str=new HashSet<>(Arrays.asList(new String[]{"Hi","Bye"}));
        System.out.println(str);

        System.out.println("--------Union--------");

        //Union
        HashSet<Integer> union = new HashSet<>(hash);
        union.addAll(hash2);
        System.out.println(union);

        System.out.println("-------Intersect---------");

        //Intersection
        HashSet<Integer> intersect = new HashSet<>(hash);
        intersect.retainAll(hash2);
        System.out.println(intersect);

        System.out.println("-------Unique ---------");
        //Unique - A-B
        HashSet<Integer> unique = new HashSet<>(hash2);
        unique.removeAll(hash);
        System.out.println(unique);
    }
}

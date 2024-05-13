package Concepts.SetConcept;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {
    enum Food{
        Apple,Mango,Orange,Guava
    }
    public static void main(String[] args) {
        EnumSet<Food> enumSet1=EnumSet.allOf(Food.class);
        System.out.println(enumSet1);

        EnumSet<Food> enumSet2=EnumSet.noneOf(Food.class);
        System.out.println(enumSet2);

        EnumSet<Food> enumSet3=EnumSet.of(Food.Apple,Food.Orange);
        System.out.println(enumSet3);

        EnumSet<Food> enumSet4=EnumSet.range(Food.Apple,Food.Orange);
        System.out.println(enumSet4);

        //Add
        EnumSet<Food> lang1=EnumSet.noneOf(Food.class);
        lang1.add(Food.Apple);
        System.out.println(lang1);
        //Addall <-Doesn't Store Duplicates
        lang1.addAll(enumSet1);
        System.out.println(lang1);

        System.out.println("-------------");
        lang1.remove(Food.Apple);
        System.out.println(lang1);
        System.out.println("---------");
        lang1.removeAll(lang1);
        System.out.println(lang1);

        enumSet2.clear();
        System.out.println(enumSet2);


        //Iteration
        Iterator<Food> i= enumSet1.iterator();
        while(i.hasNext()){
            System.out.println(i.next() );
        }
    }
}
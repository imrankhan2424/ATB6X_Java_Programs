package Concepts.ListConcept;

import java.util.Collections;
import java.util.Vector;

public class VectorConcept {
    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        v.add("10");v.add("20");v.add("30");
        v.forEach(System.out::println);

        v.remove(2);
        v.forEach(System.out::println);

        Collections.sort(v);
        v.forEach(System.out::println);

        Vector v2=new Vector();
        //v2.add("40"); //Doubt throwing exception
        v2.add(v);

        for(int i=0;i<v2.size();i++){
            String k=(String)((Vector)v2.get(0)).get(i);
            System.out.println(k);
        }
    }
}
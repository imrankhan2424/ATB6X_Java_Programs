package Concepts.MapConcept;

import java.util.LinkedHashMap;

public class LinkedHashmapConcept {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lh=new LinkedHashMap<>();
        lh.put(10,"Imran");
        lh.put(20,"Khan");

        lh.forEach((k,v)-> System.out.println("Key="+k+",Value="+v));
    }
}

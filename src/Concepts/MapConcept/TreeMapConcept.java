package Concepts.MapConcept;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {
    public static void main(String[] args) {
        //TreeMap sorts key automatically -> as it extends SortedMap Interface

        TreeMap<String,Integer> map=new TreeMap();
        map.put("Imran",40);
        map.put("Khan",90);

        map.forEach((k,v) -> System.out.println("Key="+k+" Value="+v));

        System.out.println("----------------------------------");

        Set<String> set=map.headMap("Khan").keySet(); //<map.headMap
        for(String k:set){
            System.out.println(k);
        }

        System.out.println("----------------------------------");

        Set<String> set2=map.tailMap("Imran").keySet(); //>=map.tailMap
        for(String k:set2){
            System.out.println(k);
        }


    }
}

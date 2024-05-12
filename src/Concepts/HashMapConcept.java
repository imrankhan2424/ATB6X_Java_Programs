package Concepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapConcept {
    static HashMap<String,Integer> maps2;

    static {
        maps2=new HashMap<>();
        maps2.put("Imran",40);
        maps2.put("Khan",90);
    }

    public static void main(String[] args) {

        // 1. Using HashMap Class
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Imran",40);
        map.put("Others",90);
        map.put("Happy",0);
        System.out.println("Using HashMap Class");
        System.out.println(map.get("Imran"));

        //2. Using Static HashMap
        System.out.println("\nUsing static HashMap");
        System.out.println(maps2.get("Khan"));

        //3.Immutable One Single Entry for Map<> ref variable
        Map<String,Integer> maps3= Collections.singletonMap("Imran",40);
        System.out.println("\nUsing Hashmap SingleTon - Immutable");
        System.out.println(maps3.get("Imran"));
        //maps2.put("Imran",30); UnsupportedOperationException

        //4. JDK 8
        // Stream.of(2D array) collector - Concept 1 - Map<>
        // Creating a 2D String array using Streams and collecting using Collectors
        Map<String,String> maps4=Stream.of(
                new String [][]{{"Imran","40"},{"Khan","90"},})
                .collect(Collectors.toMap(data->data[0],data->data[1]));
        maps4.put("Happy","0");
        System.out.println("\nUsing Stream of(2D Array) collect - Mutable");
        System.out.println(maps4.get("Happy"));

        //5. Stream.of(SimpleEntry) MapEntry
        Map<String,String> maps5=Stream.of(
                new AbstractMap.SimpleEntry<>("Imran","40"),
                new AbstractMap.SimpleEntry<>("Khan","90")
                ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("\nUsing Stream of(SimpleEntry) collect MapEntry - Mutable");
        System.out.println(maps5.get("Khan"));
        maps5.put("Imran","24");
        System.out.println(maps5.get("Imran"));

        //6. Stream.of(SimpleImmutableEntry) MapEntry
        Map<String,String> maps6= Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("Imran","40"),
                new AbstractMap.SimpleImmutableEntry<>("Khan","90"))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("\nUsing Stream of(SimpleImmutableEntry) collect MapEntry - Immutable");
        System.out.println(maps6.get("Khan"));
        //maps5.put("Imran","24"); UnsupportedOperationException
        //System.out.println(maps5.get("Imran"));

        //7. Empty Map
        Map<String,String> map7=Map.of();
        System.out.println("\nUsing Empty Map Of");
        System.out.println(map7);

        //8. Non Empty Map
        Map<String,String> map8=Map.of("k1","v1","k2","v2");
        System.out.println("\nUsing Non Empty Map Of");
        System.out.println(map8.get("k2"));
        //map8.put("k1","Imran"); //UnsupportedOperationException

        //9. Map of Entries
        Map<String,String> map9=Map.ofEntries(
                new AbstractMap.SimpleEntry<>("k1","v1"),
                new AbstractMap.SimpleEntry<>("k2","v2")
        );
        System.out.println("\nUsing Map Of Enteries");
        System.out.println(map9.get("k1"));
        //map9.put("k1","Imran"); //UnsupportedOperationException

        System.out.println("Guava - https://www.youtube.com/watch?v=ZWbwqXzZDR0&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=40 ");
    }
}

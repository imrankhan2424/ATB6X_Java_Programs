package Concepts.MapConcept;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTypes {
    public static void main(String[] args) {
        // HashMap, HashTable, SynchronizedMap, Concurrent Map
        // Hash Map - Not thread safe, can have one null key and multiple null values
        // Hash Table - Thread Safe, no null key and values
        // Synchronized Map - Thread Safe, can have one null key and multiple null values
        // Concurrent Map - Thread Safe, no null key and values
        // See diagram 41

        HashMap<String,Integer> map=new HashMap<>();
        map.put("Imran",20);
        map.put("Khan",40);

        //Synchronized Map
        Map<String,Integer> sync= Collections.synchronizedMap(map);
        System.out.println(sync);

        //Concurrent Map - Best
        ConcurrentHashMap<String,Integer> concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.put("Imran",20);
        concurrentHashMap.put("Khan",90);
        System.out.println(concurrentHashMap);

    }
}

package Concepts;

import java.util.*;

public class HashMapConversion {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Imran",20);
        map.put("Khan",40);

        Iterator t=map.entrySet().iterator();
        while(t.hasNext()){
            Map.Entry k=(Map.Entry)t.next();
            System.out.println(k.getKey()+":"+k.getValue());
        }


        System.out.println("---------------");

        //To ArrayList - Key
        ArrayList<String> ar_key=new ArrayList<>(map.keySet());
        for(String i:ar_key)
            System.out.println(i);

        System.out.println("---------------");

        //To ArrayList - Values
        ArrayList<Integer> ar_val=new ArrayList<>(map.values());
        for(Integer i:ar_val)
            System.out.println(i);

        System.out.println("---------------");

    }
}

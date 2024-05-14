package JavaPrograms;
import java.util.*;

public class DuplicateElementsinArray {
    public static void main(String[] args) {
        String arr[]={"Imran","Khan","Imran","Khan","C#","C","CSS","Java","Python","C#"};

        // Method 1 - Brute force
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                }
            }
        }

        System.out.println("-----------------");

        //Method 2 - Using Hashset
        Set<String> h= new HashSet<>();
        for(String k:arr){
            if(h.add(k)==false)
                System.out.println(k);
        }

        System.out.println("------Using HashMap---------");

        Map<String,Integer> map=new HashMap<>();
        for(String k:arr){
            if(map.get(k)==null){
                map.put(k,1);
            }else {
                //System.out.println(k);
                map.put(k,map.get(k)+1);
            }
        }

        Set<Map.Entry<String,Integer>> set=map.entrySet();
        for(Map.Entry<String,Integer> entry:set){
            if(entry.getValue()>1)
                System.out.println("Duplicate value: "+entry.getKey());
        }

        //StreamOf


    }
}

package JavaPrograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordsInAString {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.trim();
        String words[] = str.split(" ");
        HashMap<String, Integer> word_count = new HashMap<>();
        for(String word:words){
            if(word_count.containsKey(word)){
                word_count.put(word,word_count.get(word)+1);
            }else {
                word_count.put(word,1);
            }
        }

        Set<String> k=word_count.keySet();
        for(String word:k){
            if(word_count.get(word)>1)
                System.out.println(word+" : "+word_count.get(word));
        }
    }
}
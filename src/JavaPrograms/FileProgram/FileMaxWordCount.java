package JavaPrograms.FileProgram;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FileMaxWordCount {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\dzvnpx\\Downloads\\ISTQB\\imran2.txt");
        BufferedReader br;
        try {
            br=new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Map<String,Integer> map=new HashMap<>();
        String currentLine= null;
        try {
            currentLine = br.readLine();
            while(currentLine!=null){
                String k[]=currentLine.trim().split(" ");
                for(String str:k){
                    if(str.isBlank()){
                        continue;
                    }
                    if(map.containsKey(str)){
                        map.put(str,map.get(str)+1);
                    }else{
                        map.put(str,1);
                    }
                }
                currentLine=br.readLine();
            }
            System.out.println(map);

            Map<String, Integer> max=new HashMap<>();
            map.entrySet().stream().filter(e -> e.getValue()==(Collections.max(map.values())))
                    .forEach(k -> max.put(k.getKey(),k.getValue()));

            max.entrySet()
                    .forEach(e-> System.out.println("Max length word:"+e.getKey()+" , Max Value:"+e.getValue()));

        } catch (Exception e) {
            e.printStackTrace();
        }


        finally{
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

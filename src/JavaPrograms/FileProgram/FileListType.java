package JavaPrograms.FileProgram;

import java.io.File;
import java.util.Arrays;

public class FileListType {
    public static void main(String[] args) {
        File file =new File("C:\\Users\\dzvnpx\\Downloads");
        File list[]=file.listFiles();
        Arrays.sort(list);
        System.out.println(list.length);
        for (File listFile : list) {
            if(listFile.isFile())
                System.out.println(listFile+ " : File");
            else if (listFile.isDirectory()) {
                System.out.println(listFile+" : Directory");
            }else{
                System.out.println(listFile+" : Unknown file");
            }
        }

    }
}

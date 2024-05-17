package JavaPrograms.FileProgram;

import java.io.*;

public class FileCreate {
    public static void main(String[] args) {

        //File Creation 1
        File src_file=new File("C:\\Users\\dzvnpx\\Downloads\\ISTQB\\imran.txt");

        try {
            if(src_file.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already present");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //File Creation 2
        FileOutputStream filewrite;
        try {
            filewrite=new FileOutputStream("C:\\Users\\dzvnpx\\Downloads\\ISTQB\\imran2.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String text="this is imran2.txt";
        byte b[]=text.getBytes();
        try {
            filewrite.write(b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //3. b
    }
}

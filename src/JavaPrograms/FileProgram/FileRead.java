package JavaPrograms.FileProgram;

import java.io.*;
import java.util.*;

public class FileRead {
    public static void main(String[] args) {
        fileReadingusingInputStream();
        fileReadingusingBufferedReader();
        fileReadingusingFileReader();
        fileRreadingusingScanner();
    }

    private static void fileRreadingusingScanner() {
        System.out.println("\nUsing Scanner");
        File f=new File("C:\\Users\\dzvnpx\\Downloads\\ISTQB\\imran2.txt");

        Scanner sc;
        try {
            sc=new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (sc.hasNext()){
            System.out.print(sc.nextLine());
        }
    }

    private static void fileReadingusingFileReader() {
        System.out.println("\nUsing File Reader");
        File f=new File("C:\\Users\\dzvnpx\\Downloads\\ISTQB\\imran2.txt");

        FileReader fr;
        try {
            fr=new FileReader(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int k=0;
        try{
            while((k=fr.read())!=-1){
                System.out.print((char)k);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void fileReadingusingBufferedReader() {
        System.out.println("\nUsing Buffered Reader");
        File f=new File("C:\\Users\\dzvnpx\\Downloads\\ISTQB\\imran2.txt");

        BufferedReader br;
        try {
             br=new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int t=0;
        try{
            while((t=br.read())!=-1){
                System.out.print((char)t);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void fileReadingusingInputStream() {
        System.out.println("Using Input Stream");
        File f=new File("C:\\Users\\dzvnpx\\Downloads\\ISTQB\\imran2.txt");
        FileInputStream s=null;

        try {
            s=new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int c=0;
        try {
            while ((c = s.read()) != -1) {
                System.out.print((char)c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }





    }
}

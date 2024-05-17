package JavaPrograms.FileProgram;

import java.io.*;


public class FileCopy {
    public static void main(String[] args) {
        srcCopy("C:\\Users\\dzvnpx\\Downloads\\ISTQB\\ISTQB_CTFL_Syllabus-v4.0.pdf",
                "C:\\Users\\dzvnpx\\Downloads\\ISTQB\\ISTQB_copy.pdf");
    }
    
    private static void srcCopy(String source,String output) {
        File src_file = new File(source);
        File dest_file = new File(output);

        FileInputStream src=null;
        FileOutputStream des=null;

        try {
            src = new FileInputStream(src_file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            des = new FileOutputStream(dest_file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int c = 0;
        try {
            while ((c = src.read())!=-1) {
                des.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            if(src!=null) {
                try {
                    src.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(des!=null) {
                try {
                    des.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

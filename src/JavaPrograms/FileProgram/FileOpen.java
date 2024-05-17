package JavaPrograms.FileProgram;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileOpen {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\dzvnpx\\Downloads\\ISTQB\\imran2.txt");

        if(!Desktop.isDesktopSupported()){
            return;
        }
        else{
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

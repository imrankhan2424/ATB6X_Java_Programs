package JavaPrograms;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ImageConvertor {
    public static void main(String[] args) {
        URL url;
        try {
            url=new URL("https://static1.srcdn.com/wordpress/wp-content/uploads/2023/11/superman-legacy-comic-cover.jpg");
            BufferedImage img=ImageIO.read(url);
            ImageIO.write(img,"png", new File("Superman/legacypng.png"));
            ImageIO.write(img,"svg", new File("Superman/legacysvg.svg"));
            ImageIO.write(img,"jpeg", new File("Superman/legacyjpeg.jpeg"));
            ImageIO.write(img,"bmp", new File("Superman/legacybmp.bmp"));

            System.out.println("Conversion Done...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

package Day8;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyimg {

    public static void main(String[] args) throws IOException {
        // file input stream method

        FileInputStream fir = new FileInputStream("D:/tg.jpeg");
        FileOutputStream fin = new FileOutputStream("D:/aq11.jpeg");

        int c;
        while ((c = fir.read()) != -1) {
            fin.write(c);
        }

        System.out.println("Completed");
        fir.close();
        fin.close();
    }
}
package Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class trycatch extends Exception {

    @Override
    public String getMessage() {
        return "Please give a correct file name";
    }

    public static void main(String[] args) throws IOException {
        FileInputStream input;
        int i;

        try {
            input = new FileInputStream("D:\\JO.TXT");

            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        }
    }

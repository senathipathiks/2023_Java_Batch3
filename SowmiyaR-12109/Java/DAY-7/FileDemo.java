package Day7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        var path="D:/Demo.txt";
        try {
        	Files.writeString(Path.of(path), "Write Method testing",StandardOpenOption.APPEND);
            String data = Files.readString(Path.of(path));
//            System.out.println(path);
            System.out.println(data);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}

package Day8;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;

public class StreamIOEx1 {


	public static void main(String[] args)throws IOException {
       
		FileInputStream fin = new FileInputStream("D:\\snake.jpg");
     
		FileOutputStream fout1=new FileOutputStream("D:\\snake1.jpg");
	
        int c;
        while((c=fin.read())!=-1)

        fout1.write(c);
        System.out.print("Completed");
        fin.close();
        fout1.close();
	}

}

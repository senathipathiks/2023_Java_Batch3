package Day_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f1 = new FileInputStream("D:\\batman.jpg");
		FileOutputStream f2 = new FileOutputStream("D:\\batman1.jpg");
		int c ;
//		c=f1.read();
		while((c=f1.read())!=-1)
			f2.write((char)c);
				System.out.print("Completed");
				f1.close();
				f2.close();
	}

}

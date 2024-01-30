package Day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream f1 = new FileInputStream("D:\\watch.png");
		FileOutputStream f2 = new FileOutputStream("D:\\watch1.png");
		int c;
		while ((c = f1.read()) != -1)
			f2.write(c);
//			System.out.println((char) c);
		System.out.print("Completed");
		f1.close();
		f2.close();
	}

}

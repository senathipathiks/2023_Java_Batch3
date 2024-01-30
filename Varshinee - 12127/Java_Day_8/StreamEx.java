package Java_Day_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamEx {

	public static void main(String[] args) throws IOException {
//		FileReader fin=new FileReader("D:\\Demo.txt");
//		FileWriter fout=new FileWriter("D:\\Demo.txt");
		FileInputStream fin1=new FileInputStream("D://dog.jpg");
		FileOutputStream fout1=new FileOutputStream("D://dog1.jpg");
		int c;
		while((c=fin1.read())!=-1)
			fout1.write(c);
//			System.out.print((char)c);
		System.out.println("Completed");
		fin1.close();
		fout1.close();
	}

}

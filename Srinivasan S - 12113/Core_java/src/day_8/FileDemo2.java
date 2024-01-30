package day_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		FileInputStream fin=new FileInputStream("D:\\Thalapathy.jpg");
		FileOutputStream fout=new FileOutputStream("D:\\Thalapathy1.jpg");
		int c;
		while((c=fin.read())!=1) {
			fout.write(c);
			System.out.println(c);
			System.out.println((char)c);
		}
		System.out.println("Completed");
		fin.close();
		fout.close();
	}

}

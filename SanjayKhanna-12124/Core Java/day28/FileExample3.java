package com.day28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("D:\\sample.jpg");
		FileOutputStream fout = new FileOutputStream("D:\\sample1.jpg");
		
		int c;
		while((c=fin.read())!=-1)
			fout.write((char)c);
		System.out.println("Process Completed");
		
		fin.close();
		fout.close();

	}

}

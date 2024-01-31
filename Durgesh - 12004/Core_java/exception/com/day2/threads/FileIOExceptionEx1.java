package com.day2.threads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExceptionEx1 {

	public static void main(String[] args) throws IOException {
//		FileInputStream f1 = new FileInputStream("D:\\File.txt");
//		FileOutputStream f2 = new FileOutputStream("D:\\File1.txt");
		
		FileInputStream f1 = new FileInputStream("D:\\hogwarts.jpg");
		FileOutputStream f2 = new FileOutputStream("D:\\hogwarts1.jpg");
		
//		FileReader f1 = new FileReader("D:\\File.txt");
//		FileWriter f2 = new FileWriter("D:\\File1.txt");
		
		int c;
		while((c=f1.read())!=-1)
			f2.write(c);		
		System.out.println("Completed");
		f1.close();
		f2.close();
	}

}

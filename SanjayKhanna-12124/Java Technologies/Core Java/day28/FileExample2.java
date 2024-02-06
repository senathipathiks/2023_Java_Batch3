package com.day28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;

public class FileExample2 {

	public static void main(String[] args)throws IOException {
		
//		FileWriter fOut = new FileWriter("D:\\java1.txt");
//		FileReader fIn = new FileReader("D:\\java.txt");
//		int c;
//		while((c=fIn.read())!=-1) {
//			fOut.write(c);
//		}
//		
//		System.out.println("Process Completed");
//		fIn.close();
//		fOut.close();
		
		FileInputStream fin = new FileInputStream("D:\\java.txt");
		FileOutputStream fout = new FileOutputStream("D:\\java1.txt");
		
		int c;
		while((c=fin.read())!=-1)
			fout.write((char)c);
		System.out.println("Process Completed");
		
		fin.close();
		fout.close();
		

	}

}

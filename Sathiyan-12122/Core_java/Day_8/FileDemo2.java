package com.Day_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fin=new FileInputStream("D:\\Batman.jpg");
		FileOutputStream fout=new FileOutputStream("D:\\BatmanCopy.jpg");
		
		int c;
		while ((c=fin.read())!=-1) {
//			System.out.print((char)c);
			fout.write(c);	

		}
		
		System.out.println("\n Completed");
		fin.close();
		fout.close();

	}

}

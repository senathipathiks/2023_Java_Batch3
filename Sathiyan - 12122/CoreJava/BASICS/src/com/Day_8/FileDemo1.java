package com.Day_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		FileReader fin=new FileReader("D:\\Demo.txt");
		FileWriter fout=new FileWriter("D:\\DemoText2.txt");
		int c;
		
		while ((c=fin.read())!=-1) {
			System.out.print((char)c);
			fout.write(c);	

		}
		
		System.out.println("\n Completed");
		fin.close();
		fout.close();
		

	}

}

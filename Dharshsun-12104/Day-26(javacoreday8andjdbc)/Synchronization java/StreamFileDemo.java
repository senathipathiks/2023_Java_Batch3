package com.javacoreday8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fin1 = new FileInputStream("D:\\spiderman.jpg");
		FileOutputStream fout1 = new FileOutputStream("D:\\dbmsfinalday1.txt"); //has to get copy from 
		int c;
		while((c=fin1.read())!=-1) //end of the file is -1
		System.out.println(c);
		fout1.write((char)c);
	System.out.println("Completed");
	fin1.close();
	fout1.close();
		
	}

}

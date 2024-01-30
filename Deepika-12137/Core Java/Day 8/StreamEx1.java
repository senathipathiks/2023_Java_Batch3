package com.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class StreamEx1 {
public static void main(String[] args) throws IOException {

	FileReader fin=new FileReader("D:\\Dog.jpg");
	FileWriter fout=new FileWriter("D:\\Dog1.jpg");
	int c;
//	while((c=fin.read())!=-1)
//		System.out.println((char)c);
	
	while((c=fin.read())!=-1)
		fout.write(c);
	
	System.out.println("Completed");
	fin.close();
	fout.close();
}
}

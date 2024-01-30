package com.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("D:\\Sample.txt");
		FileInputStream fin = new FileInputStream("D:\\JAVA\\Demo.txt");
		int c;
		while((c=fin.read())!=-1) {
			System.out.print((char)c);
			fout.write(c);
		}
		int d;
		while((d=fin.read())!=-1) {
			
		}
		fin.close();
		fout.close();

	}

}

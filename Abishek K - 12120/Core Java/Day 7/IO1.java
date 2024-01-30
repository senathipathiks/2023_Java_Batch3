package com.day7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO1 {

	public static void main(String[] args) throws IOException {
		FileReader fin = new  FileReader("D:\\JAVA\\Demo.txt");
		FileWriter fout = new FileWriter("D:\\Sample1.txt");
		
		int c;
		while ((c=fin.read())!=-1) {
			System.out.print((char)c);
			fout.write(c);
			
			
		}
		fin.close();
		fout.close();
		
		
		
			
			
		}

	}



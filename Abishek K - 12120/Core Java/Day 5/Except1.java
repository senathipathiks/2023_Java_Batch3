package com.day5;

import java.io.*;

public class Except1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream input;
		
		int i;
		try {
			input = new FileInputStream("D:\\JAVA\\Sampl4e.txt");
			while((i=input.read())!=-1) {
				System.out.print((char)i);
			}
			input.close();
		}
		catch(FileNotFoundException e ) {
			System.out.println(e);
		}

	}

}

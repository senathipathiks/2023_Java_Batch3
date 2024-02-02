package com.day25;

import java.io.*;

public class ExceptionExample2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream input;
		
		int i;
		try {
			input = new FileInputStream("D://Text.txt");
			while((i=input.read())!= -1) {
				System.out.print((char)i);
			}
			input.close();
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}

	}

}

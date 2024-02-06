package com.day28;

import java.io.FileReader;
import java.io.IOException;

public class FileExample1 {

	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("D:\\java.txt");
		int c;
		while((c=f.read())!=-1)
			System.out.print((char)c);
		System.out.println("\nCompleted");
		f.close();
	}

	
}

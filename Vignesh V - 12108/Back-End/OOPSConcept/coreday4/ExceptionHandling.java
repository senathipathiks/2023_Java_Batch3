package com.coreday4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
	public static void main(String[] args) throws IOException {
		FileInputStream input;

		int i;
		try {
			
			//C:\\Users\\vignesh.velusamy\\Documents\\JAVA NOTES.txt

			input = new FileInputStream("C:\\Users\\vignesh.velusamy\\Documents\\JAVA NOTES.txt");
			while ((i = input.read())!= -1) {
				System.out.print((char) i);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}

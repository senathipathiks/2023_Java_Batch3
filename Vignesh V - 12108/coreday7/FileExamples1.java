package com.coreday7;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileExamples1 {
	public static void main(String[] args) throws IOException {

		//FileInputStream fin = new FileInputStream("C:\\Users\\vignesh.velusamy\\Documents\\task.txt");
		//FileOutputStream fout = new FileOutputStream("C:\\Users\\vignesh.velusamy\\Documents\\task1.txt");

		
		FileInputStream fin = new FileInputStream("C:\\Users\\vignesh.velusamy\\Documents\\dhar.jpg");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\vignesh.velusamy\\Documents\\dhar1.jpg");

		int c;
		while ((c = fin.read()) != -1)
			fout.write(c);

		System.out.println("completed");
		fin.close();
		fout.close();

	}

}

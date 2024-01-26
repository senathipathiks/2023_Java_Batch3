package com.day5;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;


public class IOExceptionFileNotFoundE {

	public static void main(String[] args) throws IOException {
		
		FileInputStream input;
		int i;
		try {
			input=new FileInputStream("D:\\corejava_notes\\corejava.txt");
			while((i=input.read())!=-1){
				System.out.print((char)i);
			}
			input.close();

		}
		
	catch(FileNotFoundException e) {
		System.out.println(e);
	}

	}
}


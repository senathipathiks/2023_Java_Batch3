package com.javacoreday5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input;
		int i;
		try {
			input = new FileInputStream("D:\\sena\\r.txt");
			while((i=input.read())!=-1) {
				System.out.println((char)i);//default FileInputStream is bytestream.
			}
			input.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
//		try {
//			Class temp = Class.forName("com.javacoreday4.Inheritance");//throws exception when file is not found.
//		}
//		catch(ClassNotFoundException e){
//			System.out.println(e);
//		}
		int a[] = new int[5];
		String s= "Name";
		try {
			a[1] = Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

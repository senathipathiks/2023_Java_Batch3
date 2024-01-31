package com.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException {

	public static void main(String[] args) throws Exception{
		
//		FileInputStream input;
		
//		int i;
//		try {
//			input = new FileInputStream("D:\\dummy\\addhello.html");
//			while ((i=input.read())!=-1) {
//				System.out.print((char)i);
//			}
//			input.close();			
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//		}
		
		
//		try {
//			Class temp = Class.forName("D:\\eclipse workspace\\My_project\\oops_rewind\\com\\day1.Book");
//		}
//		catch (ClassNotFoundException e) {
//			System.out.println(e);
//		}
		
		
		int a[] = new int[5];
		String s = "Name";
		try {
			a[1] = Integer.parseInt(s);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}

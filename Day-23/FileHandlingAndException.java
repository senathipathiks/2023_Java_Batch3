package com.Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.Day3.ArraySort;

public class FileHandlingAndException {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileInputStream input;
		
		int arr[]=new int [10];
		
		String s = "name";
		
		int i;
		
		try {
			input = new FileInputStream("D:\\Prasanth.txt");
			
			while((i=input.read())!=-1) {
				
				System.out.print((char)i);
				
			}
			
			// class name check
			Class temp = Class.forName("com.Day5.Employee");
			System.out.println();
			System.out.println(temp.toString());
			
			
			
			
			
			// no format exception
			
			arr[1]=Integer.parseInt(s);
			
			
			
			input.close();
		}
		
		catch(Exception e) {
			
			throw new ClassNotFoundException("Class Not Found there !!!");
		}
		
		
		
		
		finally {
			
			
		
			System.out.println(" Finally Block Excecuted");
		}
		

	}

}

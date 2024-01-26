package com.coreDay5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EH {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		FileInputStream input;
		
		int i;
		
		try {
			input = new FileInputStream("D:\\JSON.txt");
			while((i = input.read())!=-1) {
				System.out.print((char)i);
			}
			input.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
//		int a[] = new int[5];
//		String s = "Jeeva";
//		
//		try {
//			a[1] = Integer.parseInt(s);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
	}

}

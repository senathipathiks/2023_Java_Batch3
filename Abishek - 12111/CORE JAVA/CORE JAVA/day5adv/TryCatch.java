package com.day5adv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input;
		
		int i;
//		try 
//		{
//			input = new FileInputStream("D:\\h.txt");
//			while((i=input.read())!=-1)
//			{
//				System.out.print((char)i);
//			}
//			input.close();
//			
//		}
//		
//		catch(FileNotFoundException e)
//		{
//			System.out.println(e);
//		}
		
		try
		{
			Class temp = Class.forName("com.abi.Class");
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
//		int a[]=new int[5];
//		String s="Name";
//		try {
//			a[i]=
//		}
	}

}

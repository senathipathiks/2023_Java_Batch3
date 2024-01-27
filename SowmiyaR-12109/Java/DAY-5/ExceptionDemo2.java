package Day5;

import java.io.*;

public class ExceptionDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream input;

		int i;
//        try {
//        	input=new FileInputStream("D:\\JavaNotes\\Corejava\\Corejava1.txt");
//        	while((i=input.read())!=-1) {
//        		System.out.print((char)i);
//        	}
//        	input.close();
//        }
//        catch(FileNotFoundException e)
//        {
//        	System.out.println(e);
//        }
		int a[]=new int[5];
		String s="Name";
		
//		try {
//			Class temp = Class.forName("com.sowmi.ClassEx");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e);
//		}
		try {
			a[1]=Integer.parseInt(s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

package Java_Day_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo2 {

	public static void main(String[] args) throws IOException {
		
//		FileInputStream input;
		
//		int i;
//		try {
//			input=new FileInputStream("D:\\JS\\task.txt");
//			while((i=input.read())!=-1) {
//				System.out.print((char)i);
//			}
//			input.close();
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//	}
//		try {
//			Class temp=Class.forName("com.JS.task");
//			
//		}
//		catch(ClassNotFoundException e) {
//			System.out.println(e);
//		}
	int a[]=new int[5];
	String s="Name";
	try {
		a[1]=Integer.parseInt(s);
	}
	catch(Exception e) {
		System.out.println(e);
	}
		
	}

}

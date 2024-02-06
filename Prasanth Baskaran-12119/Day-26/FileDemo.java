package com.day8;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileReader f1 = new FileReader("d://Demo.txt");
		FileWriter fw = new FileWriter("d://Demo.txt");
		
		FileOutputStream fo= new FileOutputStream("d://Demo.txt");
		
		//Scanner sc = new Scanner (f1);
		//int r = f1.read();
		
//		while(sc.hasNext()) {
//			
//			System.out.print(sc.next()+" ");
//		}
			
//		fw.write("Hello Surya");
//		System.out.println("successfully");
//		
//		fw.close();
		
		int c;
		
		while((c=f1.read())!=-1) {
			
			fo.write(c);
			
			System.out.println((char)c+"");
		}
		
		System.out.println("Completed");
		
		fo.close();
		f1.close();
		
//		int r;
//		
//		
//		
//		while((r=f1.read())!=-1)
//		System.out.print((char)r+"");
		

	}

}

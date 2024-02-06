package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream("d://gittar.jpg");
		
		FileOutputStream fo = new FileOutputStream("d://gittar2.jpg");
		
		int c;
		
		while((c=fi.read())!=-1)
			fo.write(c);
		
		System.out.println("Completed");
		fi.close();
		fo.close();

	}

}

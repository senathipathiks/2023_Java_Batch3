package com.coreDay7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream("D:\\FileHandling\\wol.jpg");
		FileOutputStream fo = new FileOutputStream("D:\\FileHandling\\wol1.jpg");
		
		int c;
		
		while((c=fi.read())!=-1) {
			fo.write(c);
			
		  //fi.close();
 			fo.close();
			System.out.println("Completed");
		}
	}

}

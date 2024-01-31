package com.coreDay7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("D:\\FileHandling\\prem.txt");
		
		FileOutputStream fw = new FileOutputStream("D:\\FileHandling\\jeeva.txt");
		int c;
		while((c = f.read())!=-1)
		// System.out.print((char)c);
		
		fw.write(null);
		
		f.close();

	}

}

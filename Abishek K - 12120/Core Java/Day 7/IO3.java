package com.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\JAVA\\car1.png");
		FileOutputStream fout = new FileOutputStream("D:\\car2.png");
		int c;
		while((c=fin.read())!=-1) {
			fout.write(c);
		}
		fin.close();
		fout.close();

	}

}

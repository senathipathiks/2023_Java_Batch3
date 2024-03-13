package com.Day8;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Filedemo1 {
	public static void main(String[] args) throws IOException {
	FileInputStream fin1 = new FileInputStream("D:\\Ironman.jpg");
	FileOutputStream fout1 = new FileOutputStream("D:\\Ironman1.jpg");
	int c;
	while((c=fin1.read())!=-1)
		fout1.write(c);
    
	System.out.println("Completed");
	fin1.close();
	fout1.close();
	}
     
}

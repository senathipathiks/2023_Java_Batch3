package com.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class StreamEg {

	public static void main(String[] args) throws IOException {
//		FileReader fin=new FileReader("D:\\Core_Java\\sql.txt");
//		FileWriter fout1=new FileWriter("D:\\Core_Java\\sql.txt");
		FileInputStream fin1=new FileInputStream("D:\\Core_Java\\sql.txt"); // we can use FileReader instead of FileInput Stream
		FileOutputStream fout1=new FileOutputStream("D:\\empty.txt"); //we can use FileWriter instead of FileoutPut stream
		int c;
		while((c=fin1.read())!=-1) //-1 indicate that the file reaches the end of the file
			fout1.write(c); //copy the first file and connect to second file
		
			System.out.print((char)c);
		
			System.out.println("Completed");
			fin1.close(); //if use filereader and filewriter, it will copy only if you close it
			fout1.close();
			

	}

}

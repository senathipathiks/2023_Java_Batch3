package com.day7adv;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class FileDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("D://batman.jpg");
		FileOutputStream fout = new FileOutputStream("D://batman2.jpg");
		int c;
		while((c=fin.read())!=-1)
			fout.write(c);
			//System.out.print ((char)c);
			System.out.println("completed");
			fin.close();
			fout.close();
		
	}

}

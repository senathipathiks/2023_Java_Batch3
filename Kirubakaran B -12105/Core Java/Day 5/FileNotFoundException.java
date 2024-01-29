package day2oops;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
public class FileNotFoundException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input;
		int i;
		
		try {
			input=new FileInputStream("D:\\Kiruba\\Professinal and Behaviour\\Email Etiqute\\Classnotes Email.txt");
			while((i=input.read())!=-1) {
				System.out.print((char)i);
				
			}
			input.close();
		} 
		catch (Exception e) {
		
			System.out.println(e);
		}

	}

}

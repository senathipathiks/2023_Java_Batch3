package day4multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileReader f1=new FileReader("D:\\Kiruba\\Professinal and Behaviour\\Email Etiqute\\javatext.txt");
//		FileWriter f2=new FileWriter("");
		
		FileInputStream f1=new FileInputStream("D:\\batman.jpg");
		FileOutputStream f2=new FileOutputStream("D:\\batman1.jpg");
        int c;
        while((c=f1.read())!=-1)
        	System.out.println(c);
        	f2.write((char)c);
        	
        	System.out.print("completed");
        f1.close();
        f2.close();
        
	}

}

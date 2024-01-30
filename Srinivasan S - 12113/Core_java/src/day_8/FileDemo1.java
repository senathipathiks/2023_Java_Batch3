package day_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException ,FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fin=new FileReader("D:\\Employee\\Employee.txt");
		FileWriter fout=new FileWriter("D:\\Employee\\Employee2.txt");
		
//		FileInputStream fin1=new FileInputStream("D:\\Employee\\Employee.txt");
//		FileOutputStream fout1 =new FileOutputStream("D:\\Employee\\Employee1.txt");
		int c;
		while((c=fin.read())!=-1){
			fout.write(c);
			System.out.print((char)c);	
		}
		System.out.println("\ncompleted");
		fin.close();
		fout.close();
	}

}

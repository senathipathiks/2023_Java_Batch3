package com.day8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class StreamEg1 {

	public static void main(String[] args) throws IOException{
FileInputStream fin=new FileInputStream("D:\\flower.jpg");
FileOutputStream fout=new FileOutputStream("D:\\flowers1.jpg");
int c;
while((c=fin.read())!=-1);
fout.write(c);
System.out.println("Completed");
fin.close();
fout.close();
	}

}

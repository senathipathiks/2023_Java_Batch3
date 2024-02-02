package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
public class StreamTextFileEg {


	public static void main(String[] args) throws IOException{
FileInputStream fin1=new FileInputStream("D:\\sample\\hi.txt");
FileOutputStream fout1=new FileOutputStream("D:\\sample\\hi1.txt");
int c;
while((c=fin1.read())!=-1){
fout1.write(c);}
System.out.println("Completed");
fin1.close();
fout1.close();
	}
}

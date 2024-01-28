package com.day5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class IOExceptionEg {

	public static void main(String[] args) throws IOException {
FileInputStream input;
int i;
try {
	input = new FileInputStream("D:\\sample\\hi.txt");
	while((i=input.read())!=-1) {
		System.out.println((char)i);
	}
	input.close();
}
catch(FileNotFoundException e)
{
	System.out.println(e);
}   

	}

}

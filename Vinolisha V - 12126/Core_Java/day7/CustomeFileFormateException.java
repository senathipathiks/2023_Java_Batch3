package com.day7;
import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidFileFormat extends Exception{
	public InvalidFileFormat(String msg) {
		super(msg);
	}
}

class InvalidFile {
	public InvalidFile(String fileName) throws InvalidFileFormat{
		String[]str=fileName.split("\\.");
		if(!str[1].equals("pdf")||str[1].equals("docx")) {
			throw new InvalidFileFormat("It is not a file format");
	}
	else {
		System.out.println("File is processing ");
	}
}
}

public class CustomeFileFormateException {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the format");
		Scanner sc=new Scanner(System.in);
		String file=sc.next();
		InvalidFile f1=new InvalidFile(file);
	}
		catch(InvalidFileFormat e) {
			System.out.println(e.getMessage());
		}
	}

}

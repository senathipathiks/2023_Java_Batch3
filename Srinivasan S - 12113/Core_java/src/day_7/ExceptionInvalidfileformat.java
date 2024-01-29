package day_7;

import java.util.Arrays;
import java.util.Scanner;

class InvalidFileformat extends Exception{
	public InvalidFileformat(String msg) {
		super (msg);
	}
}

class FileEg {
	public void FileE(String format) throws InvalidFileformat{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter file name");
		format=sc.next();
		String[]eg=format.split("\\.");
//		System.out.println(Arrays.toString(eg));
//		System.out.println(eg[1]);
		
		if(!(eg[1].equals("pdf") )) {
			throw new InvalidFileformat("Enter valid file format");
		}
		else {
			System.out.println("Correct file format");
		}
		sc.close();
}
	}
public class ExceptionInvalidfileformat {

	public static void main(String[] args) {
	try {
		FileEg f1=new FileEg();
		f1.FileE("");
	} catch (InvalidFileformat e) {
		System.err.println(e.getMessage());
	}	
	catch (ArrayIndexOutOfBoundsException e) {
		System.err.println(e.getMessage());
	}
	
}
}


package rel.edu.day6.CustomException;

import java.util.Arrays;
import java.util.Scanner;

class FileFormatException extends Exception{

	@Override
	public String getMessage() {
		
		return "The given file format is not valid";
	}
	
}

public class FileFormatExpDriver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name with extension only pdf*");
		String name = sc.next();
		
		String[] ext = name.split("\\.");
		
		try {
			if (ext.length-1 >= 1) {
				if (ext[1] != "pdf") {
						throw new FileFormatException();
				}
			}else {
				throw new FileFormatException();
			}
		} catch (FileFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}

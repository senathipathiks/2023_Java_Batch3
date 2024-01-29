package Com.Day7;

import java.util.Scanner;

class CustomerFileFormatException extends Exception{
	public CustomerFileFormatException(String msg) {
    super(msg);
}
}
class FileFormat
{
	public FileFormat(String str) throws CustomerFileFormatException {
		
		String str1[] =str.split("\\.");
		String pdf=" ";
		if(!(str1[1].equals("pdf"))) {
			throw new CustomerFileFormatException("your File name is not in pdf type..");
		}
		else {
			System.out.println("Yesss correct File Format..");
		}
		 }
}
public class CustomFileFormatException {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String to check:");
	     String str = sc.nextLine();
	     FileFormat f1=new FileFormat(str);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
}
}

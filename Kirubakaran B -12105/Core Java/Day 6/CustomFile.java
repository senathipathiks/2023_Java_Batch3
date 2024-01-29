package day3exception;

import java.util.Scanner;

class InvalidFile extends Exception{
	
	public InvalidFile(String file) {
		super(file);
	}
}
class CheckFile{
	public CheckFile(String str) throws InvalidFile {
		  String str1[] =str.split("\\.");
	        String pdf=" ";
	        if(!(str1[1].equals("pdf"))) {
	            throw new InvalidFile("your File name is not in pdf type..");
	        }
	        else {
	            System.out.println("Yesss correct File Format..");
	        }
	         }
		
	}


public class CustomFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the String to check:");
		         String str = sc.next();
		         CheckFile f1=new CheckFile(str);
		        }
		        catch(Exception e) {
		            System.out.println(e.getMessage());
		        }
		
              
	}

}

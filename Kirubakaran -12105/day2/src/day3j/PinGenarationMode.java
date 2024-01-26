package day3j;

import java.util.Scanner;

public class PinGenarationMode {

	public static void main(String[] args) {
		
			
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your first name:");
	        String firstName = sc.nextLine();
	        System.out.println("Enter your middle name:");
	        String middleName = sc.nextLine();
	        System.out.println("Enter the last four digits of your Aadhar number:");
	        String aadharNumber = sc.nextLine();
	        String pin = firstName.substring(firstName.length() - 3)
	                + middleName.substring(middleName.length() / 2 - 1, middleName.length() / 2
	                        + 2) + aadharNumber 
	                        + firstName.substring(0, 3);
	        System.out.println("Your generated PIN is: " + pin);
		

	}

}

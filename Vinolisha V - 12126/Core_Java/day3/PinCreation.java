package com.day3;
import java.util.Scanner;

public class PinCreation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name:");
		String firstname=sc.next();
		System.out.println("Enter your second name:");
		String middlename=sc.next();
		System.out.println("Enter the last four digits of your AAdhar number:");
		String aadharNO=sc.next();
		String pin=firstname.substring(firstname.length()-3) + middlename.substring(middlename.length()/2-1,middlename.length()/2 + 2) + aadharNO + firstname.substring(0,3);
		System.out.println("PIN is: " + pin);
		

	}

}

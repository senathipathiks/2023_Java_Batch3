package com.day23;

import java.util.Scanner;

class Generate{
	private String firstName;
	private String middleName;
	private String lastName;
	private long aadharNumber;
	
	public Generate(String fullName, String middleName, String lastName, long aadharNumber) {
		super();
		this.firstName = fullName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.aadharNumber = aadharNumber;
	}
	
	void display() {
		StringBuilder first = new StringBuilder(3);
		StringBuilder last = new StringBuilder(3);
		StringBuilder middle = new StringBuilder(3);
		int beg =0;
		int end = firstName.length()-3;
		int mid = (middleName.length()/2) - 1;
		for(int i=0;i<3;i++) {
			first.append(firstName.charAt(end++));
			last.append(lastName.charAt(beg++));
			middle.append(middleName.charAt(mid++));
		}
		int aadharLastFour = (int) (aadharNumber%10000);
		
		System.out.println("Pin : "+first+middle+aadharLastFour+last);
		
	}
	
	
}

public class GeneratePinClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String fName = sc.next();
		System.out.println("Enter your Middle Name");
		String mName = sc.next();
		System.out.println("Enter your Last Name");
		String lName = sc.next();
		System.out.println("Enter your Aadhar Number");
		long aadhar = sc.nextLong();
		Generate obj = new Generate(fName, mName, lName, aadhar);
		obj.display();
		sc.close();
	}

}

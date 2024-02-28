package com.app;

import java.util.*;

public class SignUp {
	
	String name,mail;
	long phone;
	int otp_input,otp_show;
	

	public SignUp() {
		//LI
	}
	
	public SignUp(String name, String mail, long phone) {
		this.name = name;
		this.mail = mail;
		this.phone = phone;

	}
	
	public void signup() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Sign-Up page fill the below Credential to signup...! \n");
		
		System.out.print("Enter the name :  ");
		name=sc.next();
		
		System.out.print("Enter E-Mail id : ");
		mail=sc.next();
		
		while (!mail.contains("@gmail.com")) {
			System.out.println("Enter the valid mail-id ");
			mail=sc.next();
		}
		
		System.out.print("Enter 10 digit Phone number : ");
		phone=sc.nextLong();
		String phoneString=String.valueOf(phone);
		int length=phoneString.length();
		
		while (length!=10) {
			System.out.print("Enter the valid phone number : ");
			phone=sc.nextLong();
			phoneString=String.valueOf(phone);
			length=phoneString.length();
		}
		
		double otp=Math.random()*9999999;
		otp_show=(int)otp;
		System.out.println("Your OTP is : "+otp_show);
		
		System.out.print("Enter the OTP to Complete Sign-up : ");
		otp_input=sc.nextInt();
		
		while (otp_show!=otp_input) {
			System.out.println("Enter the Correct OTP : ");
			otp_input=sc.nextInt();
		}
		
		
		System.out.println("\n<--------------------SignUp-Successfull-------------------->\n");
		
		System.out.println("Name as : "+name);
		System.out.println("Mail as : "+mail);
		System.out.println("Phone number is : "+phone +"\n");
		
	}
}

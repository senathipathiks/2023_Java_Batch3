package com.day1;

import java.util.Scanner;

class InvalidPassword extends Exception {
	InvalidPassword(String msg){
		super(msg);
	}
}

class Error {
	public void Result(String password) throws InvalidPassword {
		String reg = 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		password = sc.next();
		if (password.length() < 14) 
			throw new InvalidPassword("The password entered doesn't match the criteria");
		else 
			System.out.println("The password matched the criteria ");
	}	
}

public class PasswordException {
	public static void main(String[] args) {
		try {
			Error p = new Error();
			p.Result(" ");
		}
		catch (InvalidPassword e) {
			System.out.println(e.getMessage());
		}
	}
}

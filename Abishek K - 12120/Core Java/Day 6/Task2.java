package com.day6;

import java.util.Scanner;

class InvalidPasswordFormat extends Exception{
	
	InvalidPasswordFormat(String msg){
		super(msg);
	}
}
class Pformat{
	
	void check() throws InvalidPasswordFormat{
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Set Your Password:");
		String pass = sc.next();
		
		if(pass.length()>8) {
			System.out.println("Your Password is Accepted");
		}
		else {
			throw new InvalidPasswordFormat("Password Minimum Length is 8-character");
		}
		
	}
}
public class Task2 {

	public static void main(String[] args) {
		try {
			Pformat obj = new Pformat();
			obj.check();
		}
		catch(InvalidPasswordFormat ex) {
			System.out.println(ex.getMessage());
		}

	}

}

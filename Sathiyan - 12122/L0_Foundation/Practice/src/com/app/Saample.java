package com.app;

import java.util.HashMap;
import java.util.Scanner;

public class Saample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String, String> signup=new HashMap<String, String>();
		
		System.out.println("Enter the number of Entries you want to enter : ");
		int entries=sc.nextInt();
		
		String password= null;
		String username = null;
		
		for (int i = 0; i < entries; i++) {
			System.out.println("Enter the username and password :");
			username=sc.next();
			password=sc.next();
			signup.put(username, password);
		}
		
		System.out.println("Username is "+signup.entrySet());
		System.out.println("Password is "+signup.get(password));
		sc.close();
	}

}

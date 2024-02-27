package com.app;

import java.util.HashMap;

import java.util.Scanner;


class Login {
	
	
}

class SignUpp {
	
	public String userName,passWord;
	public int entries;
	
	SignUpp(){
		
	}
	
	
	public SignUpp(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}


	public void setUserName(String userName,String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getPassWord() {
		return passWord;
	}

	
	public void userName(){
		Scanner sc=new Scanner(System.in);
		SignUpp se=new SignUpp();
		se.setUserName(userName, passWord);
		
		
		HashMap<String, String> signup=new HashMap<String, String>();
		
		System.out.println("Enter the number of Entries you want to enter : ");
		entries=sc.nextInt();
		
		for (int i = 0; i < entries; i++) {
			System.out.println("Enter the username and password :");
			userName=sc.next();
			passWord=sc.next();
			se.setUserName(userName, passWord);	
		}
		
		System.out.println(signup);
			
		
		
//		System.out.println("Welcome to Sign-Up page fill the below Credential to signup...! \n");
//		
//		System.out.print("Enter the name :  ");
	}
	
}

class View {
}

class Quitt {
	
}

public class Application {
	public static void main(String[] args) {
		
		SignUpp se=new SignUpp();
		se.userName();
		System.out.println(se.getPassWord());
		System.out.println(se.getUserName());
		
	}
}

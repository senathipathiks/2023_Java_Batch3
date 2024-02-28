package com.app;

import java.util.Scanner;

public class HomeScreen {
	static Scanner sc=new Scanner(System.in);
	
	public void homescreen() {
		// TODO Auto-generated method stub
		
		boolean decision=true;
		
		do {
			System.out.println("<----------Welcome---------->");
			System.out.println("\n1.Already have an Account - Sign-in \n2.New user Sign-up \n3.Show Value \n4.Quit \n");
			System.out.print("Choose the above option : ");
			int user_choice=sc.nextInt();
			System.out.println();
			
			switch (user_choice) {
			case 1:
				SignIn sign_in=new SignIn();
				sign_in.signin();
				break;
				
			case 2:
				SignUp sign_up=new SignUp();
				sign_up.signup();
				break;
				
			case 3:
				SignUp value=new SignUp();
				System.out.println("Name : "+value.name);
				System.out.println("Maild id : "+value.mail);
				System.out.println("Phone : "+value.phone);
				break;
				
			case 4:
				System.out.println("Thank you");
				decision=false;
				break;

			default:
				System.out.println("Invalid Entry...Please ! Retry...!!!");
			}
		} while (decision);
	}
}
package com.app;

public class AppDriver {

	public static void main(String[] args) {
		
		HomeScreen home=new HomeScreen();
		home.homescreen();
		
		SignUp su2=new SignUp("sathya","mail",987654l);
		System.out.println(su2.name);
		
		SignUp su=new SignUp();
		su.signup();
			
		SignIn si=new SignIn();
		si.signin();

	}

}

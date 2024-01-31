package com.coreDay6;

import java.util.regex.Pattern;

public class InvalidPassword {

	public static void main(String[] args) {
	
		String pass = "Jeeva@009";
		
		System.out.println(isValid(pass));
	}
	
	public boolean isValid(String pass) {
		
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		
		Pattern p = Pattern.compile(regex);
		
		i
	}

}

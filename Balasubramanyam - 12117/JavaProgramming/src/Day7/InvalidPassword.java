package com.Day7;


import java.util.Scanner;

public class InvalidPassword {

    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter password : ");
        String pass = sc.next();
        
        
            if (!pass.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$")) {
                try {
                throw new Exception();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }else {
                System.out.println("Password Validated successfully");
            }
		

	}

}

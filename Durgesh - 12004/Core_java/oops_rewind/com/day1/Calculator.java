package com.day1;

import java.util.Scanner;

public class Calculator {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
					
		System.out.println("First Number: ");
		double num1 = sc.nextDouble();	
		
		System.out.println("Second number : ");
		double num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/) ");
		char opr = sc.next().charAt(0);
		
		double result;
		
		
		switch (opr) {
		   case '+':
			   result = num1 + num2;
			   break;
		   case '-':
			   result = num1 - num2;
			   break;
		   case '*':
			   result = num1*num2;
			   break;	   
		   case '/':
			   result = num1/num2;
			   break;  
		   default:
			   System.out.println("Wrong values");
			   return;
			   		
		}
		
	 System.out.println(num1 + " " + opr + " " + num2 + " = " + result);	   
		  
	}

}

package com.coreday1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter the numbers");
		 num1 = sc.nextInt();
		 num2 = sc.nextInt();
		 System.out.println("enter the operator(+,-,*,/):");
		 
		 char op = sc.next().charAt(0);
		 double c = 0;
		 switch(op) {
		 case '+':
			 c = num1+num2;
			 break;
		 case '-':
			 c = num1-num2;
			 break;
		 case '*':
			 c = num1 * num2;
			 break;
		 case '/':
	         c = num1 / num2;
	         break;
	 
	        default:
	            System.out.println("You enter wrong input");
	        }
		 System.out.println("The final result");
		 System.out.println();
		 
		 System.out.println(num1 + " "+ op + " " +num2 + "=" + c);
		 }
	}



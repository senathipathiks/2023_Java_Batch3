package com.day1oops;
import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
		double num1,num2,result;
		char operator;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number 1:");
		num1=sc.nextDouble();
		System.out.println("Enter the number 2:");
		num2=sc.nextDouble();
		
		System.out.println("Enter the operator:");
		operator=sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println(result);
			break;
			
		case  '-':
			result=num1-num2;
			System.out.println(result);
			break; 
			
		case '*':
			result=num1*num2;
			System.out.println(result);
			break;
			
		case '/':
			result=num1/num2;
			System.out.println(result);
			break;
			
		 default:
	            System.out.println("Invalid operator!");
	            break;
			
		}

	}

}

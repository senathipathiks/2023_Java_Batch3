package com.day21;

import java.util.Scanner;

public class SimpleCalculator {
	private static Scanner sc;
	
	double add(double num1,double num2) {
		return num1+num2;
	}
	
	double subract(double num1,double num2) {
		return num1 - num2;
	}
	
	double multiply(double num1,double num2) {
		return num1 * num2;
	}
	
	double divide(double num1,double num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		boolean decision = true;
		SimpleCalculator obj = new SimpleCalculator();
		do {
			System.out.println("\nCalculator\n1)Add +\n2)Subract -\n3)Multiply *\n4)Divide /\n5)Quit\nChoose your Operation[1-5] :");
			sc=new Scanner(System.in);
			int op = sc.nextInt();
			switch(op) {
			case 1:{
				System.out.println("Enter the two Inputs");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(obj.add(num1, num2));
				break;
				}
			case 2:{
				System.out.println("Enter the two Inputs");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(obj.subract(num1, num2));
				break;
				}
			case 3:{
				System.out.println("Enter the two Inputs");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(obj.multiply(num1, num2));
				break;
				}
			case 4:{
				System.out.println("Enter the two Inputs");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(obj.divide(num1, num2)); 
				break;
				}
			case 5:{
				System.out.println("You are Sure ? y/n ");
				String ch = sc.next();
				if(ch.equals("y")||ch.equals("Y"))
					decision = false;
				break;
			}
			default:System.out.println("Invalid Option");break;
		}
			System.out.println("\n--------------------------------");
			
		}while(decision);
		
		System.out.println("\nThank you for Using...!");

	}

}

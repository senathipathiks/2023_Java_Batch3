package com.day1.core;

import java.util.Scanner;

public class Calculator {
	
	static Scanner sc=new Scanner(System.in);
	
	private int numberOne;
	private int numberTwo;
	
	Calculator(){
		
	}

	public Calculator(int numberOne, int numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}
	
	void add() {
		double added=numberOne+numberTwo;
		System.out.println(added);
	}
	
	void sub() {
		double sub=numberOne-numberTwo;
		System.out.println(sub);
	}
	
	void multiply() {
		double mul=numberOne*numberTwo;
		System.out.println(mul); 
	}
	
	void divide() {
		double divide=numberOne/numberTwo;
		System.out.println(divide);
	}
	
	void display(){
		System.out.println("1.Addition\n2.Subtraction\n3.Multiply\n4.Divide");
		int input=sc.nextInt();
		Calculator cal=new Calculator(5,5);
		
		switch (input) {
		case 1:
			cal.add();
			break;
			
		case 2:
			cal.sub();
			break;
			
		case 3:
			cal.multiply();
			break;
			
		case 4:
			cal.divide();
			break;

		default:
			System.out.println("Invalid input");
			break;
		}
	}




	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.display();
		

	}

}

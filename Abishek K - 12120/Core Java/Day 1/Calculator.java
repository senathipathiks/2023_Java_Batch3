package com.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number1: ");
		num1=obj.nextInt();
		System.out.println("Emter the number2: ");
		num2=obj.nextInt();
		int add = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		int div = num1/num2;
		System.out.println("Addition: " + add);
		System.out.println("Substraction: " + sub);
		System.out.println("Multiplication: "+ mul);
		System.out.println("Divison: "+div);

	}

}

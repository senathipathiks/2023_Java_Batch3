package com.day2.core;
import java.util.*;
public class CommandLine {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int rem=a%b;
		
		System.out.println("Addition of two number is : "+add);
		System.out.println("Subtraction of two number is : "+sub);
		System.out.println("Multiplication of two number is : "+mul);
		System.out.println("Div of two number is : "+div);
		System.out.println("Remainder of the 2 number is : "+rem);

	}

}

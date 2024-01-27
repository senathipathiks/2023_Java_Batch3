package com.Basic;
import java.util.*;
public class CommandLineArg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value: ");
		int a=sc.nextInt();
		System.out.println("Enter the b value: ");
		int b=sc.nextInt();
		System.out.println("Sum :"+(a+b));
		System.out.println("Sub :"+(a-b));
		System.out.println("Div : "+a/b);
		System.out.println("Mult : "+a*b);
		System.out.println("Reminder : "+a%b);
	}

}

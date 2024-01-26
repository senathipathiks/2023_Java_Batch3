package com.day22;

import java.util.Scanner;

public class Example{

@SuppressWarnings("resource")
public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Sum : "+c);
	}
}
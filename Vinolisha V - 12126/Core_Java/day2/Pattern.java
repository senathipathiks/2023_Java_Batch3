//3. Write a Java program to display the following patterns.

//*
//**
//***
//****
//*****


package com.day2;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int a=sc.nextInt();
		
		for(int i=0; i<=a; i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}

package com.coreDay2;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// Multiplication Table
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to make Table : ");
		
		int num = sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			
			int mul = num * i;
			System.out.println(num + " X " + i + " = "+ mul  );
		}
			

	}

}

package com.coreDay2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		//Reverse a Number
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Reverse : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		
		while(num > 0) {//123
			
				int rem = num%10;//3
				rev = rev * 10 + rem; 
				num = num/10;//12
			
			
		}
		
		System.out.println(rev);
		
	}

}

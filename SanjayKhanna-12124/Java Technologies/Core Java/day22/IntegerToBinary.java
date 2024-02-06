package com.day22;

import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer : ");
		int num = sc.nextInt();
		StringBuilder result = new StringBuilder();
		while(num>0) {
			int rem = num%2;
			result.append(rem);
			num=num/2;
		}
		System.out.println("Binary Value : "+result.reverse().toString());

	}

}

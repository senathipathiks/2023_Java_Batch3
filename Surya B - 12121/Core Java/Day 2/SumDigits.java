package com.coreDay2;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		//Sum of Digits
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Number : ");
		int digit = sc.nextInt();
		int sum =0;
		
		while(digit > 0) {
			sum = digit%10 + sum;
			digit =  digit/10;
		}
		
		
		System.out.println(sum);

	}

}

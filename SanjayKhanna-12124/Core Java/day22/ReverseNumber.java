package com.day22;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int resNum = 0;
		while(num>0) {
			int rem = num%10;
			resNum = resNum*10 +rem;
			num/=10;
		}
		System.out.println("Reserve of Number : "+resNum);

	}

}

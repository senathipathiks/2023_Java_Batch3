package com.day2;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		
		while(a!=0) {
			int num=a%10;
			sum=sum*10+num;
			a=a/10;

	}
		System.out.println("The sum of the digits:"+sum);
}
}
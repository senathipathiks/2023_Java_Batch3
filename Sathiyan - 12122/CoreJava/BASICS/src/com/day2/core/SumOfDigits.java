package com.day2.core;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=569;
		int sum=0;
		int res=0;
		while(a>0) {
			sum=a%10;
			res=res+sum;
			a=a/10;
		}
		System.out.println(res);
	}

}

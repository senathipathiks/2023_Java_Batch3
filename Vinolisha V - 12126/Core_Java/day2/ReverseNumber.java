package com.day2;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		
		int result=0;
		
		
		while(n>0) {
			int reminder=n%10;
			result=result*10+reminder;
			n=n/10;
			
		}
		System.out.println(result);
		
		

	}

}

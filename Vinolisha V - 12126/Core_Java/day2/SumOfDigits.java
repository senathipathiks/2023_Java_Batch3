package com.day2;
import java.util.Scanner;


public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ente the number:");
		int a=sc.nextInt();
		
		int sum=0;
		
		while(a>0) {
			int reminder=a%10;
			sum=sum+reminder;
			a=a/10;
		}
			System.out.print(sum);
		}

	}



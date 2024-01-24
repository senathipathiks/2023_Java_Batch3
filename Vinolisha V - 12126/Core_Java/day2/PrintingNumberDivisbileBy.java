package com.day2;
import java.util.Scanner;


public class PrintingNumberDivisbileBy {

	public static void main(String[] args) {
		
		System.out.print("\nDivide by 3 is:");
		for(int i=0;i<=100;i++) {
			if(i%3==0)
			System.out.print(i+",");
			
		}
		
		System.out.print("\nDivide by 5 is:");
		for(int i=0;i<=100;i++) {
			if(i%5==0)
			System.out.print(i+",");
			
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		
		System.out.println("Enter the number between 100:");
		int a=sc.nextInt();
		
		for(int i=0;i<=100;i++) {
			if(i%a==0) 
				System.out.print(i+",");
			
		}
		

	}

}

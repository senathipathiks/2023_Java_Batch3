package com.day2;

import java.util.Scanner;

/*Write a Java program to display the following patterns.

*
**
***
****
*****	*/
public class starprg {

	public static void main(String[] args) {
		System.out.println("enter the number of rows:");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

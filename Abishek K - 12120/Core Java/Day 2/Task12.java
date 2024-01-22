//Reverse a number

package com.day;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		System.out.println("Enter the number to reverse:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		
		while(num>0) {
			int ls=num%10;
			rev=rev*10+ls;
			num=num/10;
		}
		
		System.out.println("Reverse number: "+rev);

	}

}

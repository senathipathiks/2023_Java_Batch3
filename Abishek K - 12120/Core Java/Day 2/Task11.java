//Sum of Digits

package com.day;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
	   System.out.println("Enter the Digit to find the sum: ");
	   Scanner sc = new Scanner(System.in);
	   int num=sc.nextInt();
	   int sum=0;
	   
	   while(num>0) {
		  sum = sum+ num%10;
		   num=num/10;
	   }
	   System.out.println("Sum of the Digits is: "+ sum);

	}

}

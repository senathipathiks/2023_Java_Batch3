package com.Day2;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		int arr[] = new int[4];
//		
//		
//		
//	Scanner sc = new Scanner (System.in);
//	
//	System.out.println("Enter the values");
//	
//	for (int i = 0; i < arr.length; i++) {
//		
//		
//		arr[i]=sc.nextInt();
//		
//	}
	
	
     int number = 986;
     
     int sum1=0,digit;
     
     while (number>0) {
    	 
    	 digit = number % 10 ;
    	 sum1= sum1 +digit;
    	 
    	 number = number/10;
    	 
     }
     System.out.println(sum1);
     
     
     
     
     
	
//	
//	int sum=0;
//	for (int i : arr) {
//		
//		
//	 sum = sum + i;
     
//	 
//	}
//	System.out.println(sum);
	
	
	}

}

package com.day3;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
	
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Element: ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter each element");
			int val=sc.nextInt();
			arr[i]=val;
			
		}
        System.out.println("The Final Arraya is:");
        for(int i:arr) {
        	System.out.println(i);
        	sum=sum+i;
        }
        int avg=sum/n;
        System.out.println("Sum of Array is: "+sum);
        System.out.println("Average of arrays is: "+ avg);
        
        
       
	}

}

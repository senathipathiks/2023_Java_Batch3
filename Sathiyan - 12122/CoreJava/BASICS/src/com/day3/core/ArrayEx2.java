package com.day3.core;
import java.util.*;
public class ArrayEx2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		int sum=0;
		
		System.out.println("Enter the Number");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Value stored");
		
		for (int i : arr) {
			sum=sum+i;
		}
		
		System.out.println("Sum is : "+sum);
		int avg=sum/10;
		System.out.println("Average is : "+avg);
	}

}

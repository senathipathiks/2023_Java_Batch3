package com.corejava.day3;
import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter The Size Of The Array");
		int size=input.nextInt();
		System.out.println("Enter The Values For The Array");
		int values=input.nextInt();
		int[] arr=new int[size];
		for (int i = 0; i < size-1; i++) {
		arr[i]=input.nextInt();	
		}
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Sum Of The Array : "+sum);
		System.out.println("Average Of The Array  : "+sum/size);
		
	}

}

package com.day3;
import java.util.Scanner;

public class SumAverageInArray {

	public static void main(String[] args) {
		int sum=0;
		float average;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No.of elements you want:");
		int a=sc.nextInt();
		int arr[]=new int[a];
		
		System.out.println("Enter " + a + " Digit number");
		
		for (int i=0; i<a;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
				
			}
		System.out.println("Sum of " +a + " digits number is" + sum);
		average=sum/a;
		System.out.println("Average of the value is:" + average);
		}
		
		
		

	}



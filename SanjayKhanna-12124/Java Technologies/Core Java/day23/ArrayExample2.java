package com.day23;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[] arr = new int[10];
		 
		 System.out.println("Enter Array Size :");
		 int size = sc.nextInt();
		 
		 System.out.println("Enter Array Element :");
		 
		 int sum = 0;
		 
		 for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
			 sum += arr[i];
		 }
		 
		 System.out.println("Sum of Array : "+sum);
		 System.out.println("Average of Array : "+(sum/size));
		 
		 sc.close();

	}

}

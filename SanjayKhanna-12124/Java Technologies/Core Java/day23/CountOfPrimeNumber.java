package com.day23;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfPrimeNumber {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int primeCount = 0;
		for(int i=0;i<size;i++) {
			int count = 0;
			for(int j=2;j<=arr[i]/2;j++) {
				if(arr[i]%j==0)
					count++;
			}
			if(count==0)
				primeCount++;
				
		}
		System.out.println("Array : "+Arrays.toString(arr));
		System.out.println("Prime No Count : "+primeCount);
		sc.close();
	}

}

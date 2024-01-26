package com.Day3;

import java.util.Iterator;

public class NoOfPrime {

	public static void main(String[] args) {
		
		int arr[]= {5,3,1,3,9,2};
		
		
		
		int count=0;
		
		for (int i : arr) {
			
			if(isPrime(i)) {
				count++;
			}
			
		}
		
		System.out.println("The Count of Prime values are :"+count);
		
		
		
	}

private static boolean isPrime(int n) {
		
		if(n<2) {
			return false;
		}
		
		for (int i = 2; i < n; i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	}
	



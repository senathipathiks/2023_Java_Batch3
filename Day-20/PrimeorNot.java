package com.Day2;

public class PrimeorNot {

	public static void main(String[] args) {
	
		
		int low , high;
		
		low=1;
		high=20;
		
		for (int i = low; i < high; i++) {
			
			if(isPrime(i)) {
				System.out.println(i);
			}
			
		}

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

package com.coreday2;

public class Primeelements {
	public static void main(String[] args) {
		int count = 0;
		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		for (int i = 0; i < arr.length; i++) {
			
			boolean isDuplicate = false;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				boolean isPrime = true;
				for (int j = 2; j <= arr[i] / 2; j++) {
					if (arr[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					count++;
				}
			}
		}
		System.out.println("Number of prime elements in given array: " + count);
	}
}

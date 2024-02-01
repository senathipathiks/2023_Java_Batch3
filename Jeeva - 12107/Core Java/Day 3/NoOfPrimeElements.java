package com.corejava.day3;

public class NoOfPrimeElements {
	public static void main(String[] args) {
	  
		int[] prime= {2,6,7};
		int count,c=0;
		for (int i = 0; i < prime.length; i++) {
			count=0;
			for (int j = 1; j <= prime[i]; j++) {
				if(prime[i]%j==0) {
					
					count++;
				}
			}
			if(count==2) {
			c++;
			}
		}
		System.out.println("No Of PrimeElements are : "+c);
	}

}

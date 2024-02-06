package com.day22;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range Upper limit : ");
		int num = sc.nextInt();
		System.out.print("Number : ");
		for(int i=2;i<=num;i++) {
			boolean fact = true;
			for(int j=2;j<=i/2;j++) {
				if(j!=i&&i%j==0) {
					fact=false;
					break;
				}
			}
			if(fact) {
				System.out.print(i+" ");
			}
		}

	}

}

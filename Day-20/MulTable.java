package com.Day2;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the Which mul table you want :");
		
		int mul = sc.nextInt();
		
		System.out.println(" The "+mul+"th Mul tables are below : ");

		
		for (int i = 1; i <=10; i++) {
			
						
			System.out.println( i+"X"+mul+ "="+i*mul);
			
			
			
			
		}
		
		

	}

}

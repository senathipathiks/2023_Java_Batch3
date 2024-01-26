package com.day22;

public class PatternPrint3 {

	public static void main(String[] args) {
		
		System.out.println("Pattern Print 3 Diamond :  \n");
		
		for(int i=1 ; i<=5;i++) {
			
			for(int j=1 ; j<=5-i;j++) {
				System.out.print("  ");
			}
			
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int i = 4;i>0;i--) {
			
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
			}
			
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}

	}

}

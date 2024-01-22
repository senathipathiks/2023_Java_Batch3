//Left Triangle Pattern

package com.day;

public class Task15 {

	public static void main(String[] args) {
		int row=8;
		for(int i=1;i<=row;i++) {
			for(int n=7;n>=i;n--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

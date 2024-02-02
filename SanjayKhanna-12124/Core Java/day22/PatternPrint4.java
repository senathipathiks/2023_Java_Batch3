package com.day22;

public class PatternPrint4 {

	public static void main(String[] args) {
		
		System.out.println("Number Pattern : \n");
		int num1 =1;
		int num2 = 9;
		for(int i=1;i<=4;i++) {
			if(i==1||i==4) {
				for(int j=1;j<=4;j++) {
					System.out.print((num1++)+"  ");
				}
				System.out.println();
			}
			else {
				for(int j=1;j<=4;j++) {
					System.out.print((num2++)+" ");
				}
				System.out.println();
			}
		}

	}

}

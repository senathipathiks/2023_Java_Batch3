package com.day22;

public class DivisibleProgram {

	public static void main(String[] args) {
		
		System.out.print("Divisiblity 3,5 : ");
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
			else if(i%5==0) {
				System.out.print(i+" ");
			}
		}

	}

}

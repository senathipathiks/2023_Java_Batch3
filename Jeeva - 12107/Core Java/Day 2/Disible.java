package com.coreDay2;

public class Disible {

	public static void main(String[] args) {
		
		for(int i = 1 ; i<=100 ; i++) {
			if(i%3 == 0) {
				System.out.println("The Number " + i + " is divisible by 3" );
			}
			else if(i%3 == 0) {
				System.out.println("The Number " + i + " is divisible by 5" );
			}
			if(i%3 == 0 && i%5 ==0) {
				System.out.println("The Number " + i + " is divisible by both 3 and 5" );
			}
		
		}
	}

}

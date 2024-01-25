package com.day2.core;

public class DivisableNumber {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println(i+" is divisable by both 3 and 5" );
			}else if (i%3==0) {
				System.out.println(i+" is Divisble by 3");
			} else if (i%5==0) {
				System.out.println(i+" is divisble by 5");
			} 
		}

	}

}

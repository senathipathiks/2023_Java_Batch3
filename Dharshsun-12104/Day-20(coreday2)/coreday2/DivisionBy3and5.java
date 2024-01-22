package com.coreday2;

public class DivisionBy3and5 {
	public static void main(String args[]) {
		System.out.println("\n Divided by 3");
		for(int i=1;i<100;i++) {
			if(i%3==0)
				System.out.println(i+",");
		}
		System.out.println("\n Divided by 5");
		for(int i=1;i<100;i++) {
			if(i%5==0)
				System.out.println(i+",");
	}
		System.out.println("\n Divided by both 3&5");
		for(int i=1;i<100;i++) {
			if(i%3==0 && i%5==0)
				System.out.println(i+",");
}
}
}

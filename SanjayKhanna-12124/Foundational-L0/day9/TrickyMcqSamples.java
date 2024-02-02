package com.day9;


public class TrickyMcqSamples {
	//Tricky question 1
//	static int k;
//	
//	static boolean count() {
//		k++;
//		return true;
//	}
//	public static void main(String[] args) {
//		int a=10,b=20;
//		boolean b1 = a>b&&count();
//		boolean b2 = a<b&&count();
//		
//		System.out.println(k);
//
//	}
//
	
	//Tricky question 2
	
//	public static void main(String[] arg) {
//		System.out.println(10+20);
//		System.out.println("10"+20);
//		System.out.println("10"+20+30);
//		
//	}
	
	//Tricky question 3
	
//	public static void main(String[] args) {
//		int a=10;
//		
//		int c= ++a+a+++a;
//		System.out.println(c);
//	}
	
	//Tricky question 4 
	
	public static void main(String[] agr) {
		int a=2;
		switch (a) {
		default:System.out.println("D");
		case 2:System.out.println("B");
		case 1:System.out.println("A");
		case 3:System.out.println("C");
		}
	}
}

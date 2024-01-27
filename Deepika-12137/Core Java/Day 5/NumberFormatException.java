package com.day5;

public class NumberFormatException {
public static void main(String[] args) {
	int a[]=new int[5];
	String s="Name";
	
	try {
		a[1]=Integer.parseInt(s);
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

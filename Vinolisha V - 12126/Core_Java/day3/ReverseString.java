package com.day3;

public class ReverseString {

	public static void main(String[] args) {
		String n="Java is Programming Language";
		
		String s1[]=n.split(" ");
		String rev=" ";
		System.out.println(n);
		
		for (int i=0;i<s1.length;i++) {
			rev=s1[i]+ " "+rev;
		}
		System.out.println(rev);
	}

}

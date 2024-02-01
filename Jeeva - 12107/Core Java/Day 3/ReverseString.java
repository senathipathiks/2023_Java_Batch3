package com.corejava.day3;

public class ReverseString {
	public static void main(String[] args) {
		
		String s="Java Is A Programming Language";
		
		String[] reverse=s.split(" ");
		for (int i =  reverse.length-1;i>=0;i--) {
			System.out.print(reverse[i]+" ");
		}
		
		
	}

}

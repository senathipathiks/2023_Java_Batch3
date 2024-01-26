package com.corejava.day3;

public class Palindrome {
	public static void main(String[] args) {
		
		String s="RacecaR";
		
		String s1="";
		for (int i =s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		if(s.equals(s1))
		System.out.println(true);
		else
			System.out.println(false);
		
	}

}

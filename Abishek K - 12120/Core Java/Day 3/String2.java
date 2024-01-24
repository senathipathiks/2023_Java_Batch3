package com.day3;

public class String2 {

	public static void main(String[] args) {
				StringBuffer s1 = new StringBuffer("Java");
				System.out.println(s1.append("Programming"));
				//System.out.println(s1.reverse());
				System.out.println(s1.length());
				System.out.println(s1.insert(5, "is a"));
				System.out.println(s1.replace(0, 5, "c,c++ "));
				System.out.println("*************************");
				StringBuilder s2 = new StringBuilder("Abishek ");
				s2.append("is a good boy");
				System.out.println(s2);

	}

}


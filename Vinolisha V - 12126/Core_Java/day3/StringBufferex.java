package com.day3;

public class StringBufferex {

	public static void main(String[] args) {
		StringBuffer c=new StringBuffer("java");
		System.out.println(c.append(" Programming"));
//		System.out.println(c.reverse());
		System.out.println(c.length());
		System.out.println(c.insert(5, " is a "));
		System.out.println(c.replace(0, 5, "c,c++"));

	}

}

package com.day2;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "My Name is Durgesh Nandhini";
		
		String s2 = "My name is Durgesh";
		
		System.out.println(s1.charAt(6));
		System.out.println(s1.length());
		System.err.println(s1.indexOf("i"));
		System.out.println(s1.lastIndexOf("d"));
		System.out.println(s1.equals("my name is durgesh nandhini"));
		System.out.println(s1.equalsIgnoreCase("my name is durgesh nandhini"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase("my name iS durGesh nandHini"));
		System.out.println(s1.concat(s2));
		System.out.println(s1.endsWith("ini"));
		System.out.println(s1.substring(8,9));
		System.out.println(s1.trim());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		char[] c = s1.toCharArray();
		for (char i: c) {
			System.out.println(i);
		}
		
		
		
	}

}

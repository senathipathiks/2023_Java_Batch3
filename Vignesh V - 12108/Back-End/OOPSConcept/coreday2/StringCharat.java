package com.coreday2;

public class StringCharat {
	public static void main(String[] args) {

		String s1 = new String("java programming");
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.equals("java programming"));
		System.out.println(s1.equalsIgnoreCase("java programming"));
		System.out.println(s1.compareTo("java programmin"));
		System.out.println(s1.compareToIgnoreCase("java programmin"));
		System.out.println(s1.concat("world"));
		System.out.println(s1.endsWith("ing"));
		System.out.println(s1.substring(5,7));
		System.out.println(s1.trim());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		char[] c=s1.toCharArray();
		

	}
}

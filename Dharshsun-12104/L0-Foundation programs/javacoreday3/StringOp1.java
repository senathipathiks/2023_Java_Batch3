package com.javacoreday3;

public class StringOp1 {
	public static void main(String[] args) {
//		String s1 = "Java";
//		String s2 = "Java";
		String s2 = new String("  Java ,Programming  " );
		System.out.println(s2.charAt(2));
		System.out.println(s2.length());
		System.out.println(s2.indexOf('a'));
		System.out.println(s2.lastIndexOf('a'));
		System.out.println(s2.equals("java programming"));
		System.out.println(s2.equalsIgnoreCase("java programming"));
		System.out.println(s2.compareTo("Java Programming"));
		System.out.println(s2.compareToIgnoreCase("Java Programming"));
		System.out.println(s2.concat("world"));
		System.out.println(s2.endsWith("ing"));
		System.out.println(s2.substring(4));
		System.out.println(s2.substring(5,7));
		System.out.println(s2.trim());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		char[] c= s2.toCharArray();
		String s[] = s2.split("");
//		System.out.println(s);
		for(char ch:c) {
			System.out.print(ch);
		}
		s2=s2.replace(',', ';');
		System.out.println(s2);
//		System.out.println(s1==s2); //compares the references.
	}
	}


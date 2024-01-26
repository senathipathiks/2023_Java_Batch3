package com.day3.core;

public class StringExample {

	public static void main(String[] args) {
		

//		String s1="Java";
//		String s2="Java";
//		String s2= new String("Java");
//		
//		System.out.println(s1==s2);
		
		String s3=new String(" Java Programming");
		
		System.out.println(s3.charAt(3));
		System.out.println(s3.length());
		System.out.println(s3.indexOf('P'));
		System.out.println(s3.lastIndexOf('a'));
		System.out.println(s3.equalsIgnoreCase("Java programming"));// Ignore the cases.
		System.out.println(s3.equals("Java Proramming"));//Case sensitive
		System.out.println(s3.compareTo("Java Programming"));// both are equal returns 0
		System.out.println(s3.compareToIgnoreCase("Java Programmin"));
		System.out.println(s3.concat(" By Sathya"));
		System.out.println(s3.endsWith("ing"));
		System.out.println(s3.substring(4,7));
		System.out.println(s3.trim());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		char[] c= s3.toCharArray();
		for (char d : c) {
			System.out.println(d);
		}
		
	}

}

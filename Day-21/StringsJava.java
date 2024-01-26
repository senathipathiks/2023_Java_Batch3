package com.Day3;

import java.util.*;

public class StringsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Java";
		String s2 = "Java";
		
		String s3 = new String("Java");
		
		String s4 = new String("Java");
		
		System.out.println(s4.hashCode());
		
		
		System.out.println(s3.hashCode());
		
		
		System.out.println(s1==s2);
		
		System.out.println("************************************************");
		
		String c = new String("Java Programming");
		
		System.out.println(c.charAt(2));
		
		System.out.println(c.length());
		
		System.out.println(c.indexOf('a'));
		System.out.println(c.lastIndexOf('a'));
		
		System.out.println(c.equals("Java Programming"));
		
		System.out.println(c.equalsIgnoreCase("java programming"));
		
		System.out.println(c.compareTo("Java Programming")==0);
		
		System.out.println(c.compareToIgnoreCase("JAVA programming")==0);
		
		System.out.println(c.concat(" World"));
		
		System.out.println(c.startsWith("J"));
		
		System.out.println(c.endsWith("ing"));
		
		System.out.println(c.substring(5,7));
		
		System.out.println(c.trim());
		
		System.out.println(c.toLowerCase());
		
		System.out.println(c.toUpperCase());
		
		char[] a = c.toCharArray();
		
		for (char d : a) {
			
			System.out.print(d+" ");
		}
		System.out.println();
		System.out.println("*********************************************************************");
		
		
		StringBuffer sb = new StringBuffer("Java");
		
		sb.append(" World");
		
		
		
		System.out.println(sb);
		
		//System.out.println(sb.reverse());
		
		System.out.println(sb.length());
		
		System.out.println(sb.insert(5, "Programming "));
		
		System.out.println(sb.replace(0, 4, "Python"));
		
		System.out.println(sb.capacity());
		
		
		
		
	}

}

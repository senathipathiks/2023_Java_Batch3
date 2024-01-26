package com.day3;

public class Strins {
public static void main(String[] args) {
	String s1="java";
	
	//String s2="Python";
	String s2=new String("java");
	System.out.println(s1==s2);
	
	String st=new String(" Java programming  ");
	System.out.println(st.charAt(4));
	System.out.println(st.length());
	System.out.println(st.indexOf('m'));
	System.out.println(st.lastIndexOf('a'));
	System.out.println(st.equals("Java programming"));
	System.out.println(st.equalsIgnoreCase("java programming"));
	System.out.println(st.compareTo("Java Programming"));
	System.out.println(st.compareToIgnoreCase("java programming"));
	System.out.println(st.concat("world"));
	System.out.println(st.endsWith("i"));
	System.out.println(st.substring(5, 8));
	System.out.println(st.trim());
	System.out.println(st.toLowerCase());
	System.out.println(st.toUpperCase());
	char[] c=st.toCharArray();
	for (char d : c) {
		System.out.println(d);
	}
}
}

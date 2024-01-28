package com.day3array;

public class StringEg2 {

	public static void main(String[] args) {
	String s1=new String("   Java programming    ");
	System.out.println(s1.charAt(2));
	System.out.println(s1.length());
	System.out.println(s1.indexOf('m'));
	System.out.println(s1.lastIndexOf('m'));
	System.out.println(s1.equals("Java programming"));
	System.out.println(s1.equalsIgnoreCase("java Programming"));
	System.out.println(s1.compareTo("Java programming"));// compare the value if both are equal it return 0 
	System.out.println(s1.compareToIgnoreCase("java Programming"));
	System.out.println(s1.concat(" World"));
	System.out.println(s1.startsWith("J"));
	System.out.println(s1.endsWith("d"));
	System.out.println(s1.substring(4));
	System.out.println(s1.substring(4,7));
	System.out.println(s1.trim()); //remove the extra spaces
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.replace('J','z'));
	char[] c =s1.toCharArray();
	String s[]=s1.split(" ");
	for (char ch:c)
	{
		//System.out.println(ch);
	}
	}

}

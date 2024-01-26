package com.day3;

public class String1 {

	public static void main(String[] args) {
		
		String s1= new String("Java Programming");
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.equals("java programming")); //it is case sensitive
		System.out.println(s1.equalsIgnoreCase("java programming")); //it is used to avoid the case sensitive
        
		//comapreTO - return '0' if the both are equals
		System.out.println(s1.compareTo("Java Programming"));
		//return '-ve' if the s1 is greater than s2 or other strings(s1>s2)
		System.out.println(s1.compareTo("Java Programmi"));
		//return '+ve' if the s1<s2
		System.out.println(s1.compareTo("Java Programmingss"));
		
		System.out.println(s1.compareToIgnoreCase("java programmin"));
		System.out.println(s1.concat("world"));
		System.out.println(s1.endsWith("ing"));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 7));
		System.out.println(s1.trim()); //it is used to remove the white spaces between the strings
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println("***************char Array*********************");
		char[] c=s1.toCharArray();
		for(char i:c) {
			System.out.println(i);
		}
	}

}

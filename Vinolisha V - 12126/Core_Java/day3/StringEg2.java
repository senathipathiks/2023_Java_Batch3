package com.day3;

public class StringEg2 {

	public static void main(String args[]) {
		
		String s1=new String(" Java Programming ");
		
		System.out.println(s1.charAt(2));//it will display the string character
		System.out.println(s1.length()); //it will display the total no of characters
		System.out.println(s1.indexOf('P'));//it will display p index number
		System.out.println(s1.lastIndexOf('a'));// it will display the last 'a' index number
		System.out.println(s1.equals("Java Programming"));
		System.out.println(s1.equalsIgnoreCase("java programming"));//remove Case sensitive
		System.out.println(s1.compareTo("Java Programming"));// o means true 1 means false 
		System.out.println(s1.compareToIgnoreCase("java programming"));//remove case sensitive
		System.out.println(s1.compareToIgnoreCase("javaprogramming"));//remove case sensitive
		System.out.println(s1.concat("World")); 
		System.out.println(s1.endsWith("ing"));// it returns true or false
		System.out.println(s1.substring(5,7));// overloading
		System.out.println(s1.trim());//to remove the treading and white spaces
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace('J','Z'));
		char[] c=s1.toCharArray();//it will store in a array
		String a[]=s1.split("");// split the bigger string into string array
		for(String ch:a) {
			System.out.println(ch);
		}
		
		
	}
}

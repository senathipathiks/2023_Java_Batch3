package com.day23;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = new String("Sanjay Khanna");
		System.out.println("Charcter at Position 8 : "+str.charAt(8));
		System.out.println("Length of String : "+str.length());
		System.out.println("Index of first occurence 'a' : "+str.indexOf('a'));
		System.out.println("Index of last occurence 'a' : "+str.lastIndexOf('a'));
		System.out.println("String equal : "+str.equals("sanjay khanna"));
		System.out.println("String equal ignore case sensitive : "+str.equalsIgnoreCase("sanjay khanna"));
		System.out.println("String compare : "+str.compareTo("sanjay khanna"));
		System.out.println("String compare ignore case sensitive : "+str.compareToIgnoreCase("sanjay khanna"));
		System.out.println("String ending with S : "+str.endsWith("anna"));
		System.out.println("String Concatenation of S : "+str.concat(" S"));
		System.out.println("SubString of String : "+str.substring(7, 13));
		System.out.println("Using Trim() : "+str.trim());
		System.out.println("Lower case : "+str.toLowerCase());
		System.out.println("Upper case : "+str.toUpperCase());
		char[] c = str.toCharArray();
		System.out.print("Using toCharArray : ");
		for(char i:c)
			System.out.print(i);
		System.out.println();
		

	}

}

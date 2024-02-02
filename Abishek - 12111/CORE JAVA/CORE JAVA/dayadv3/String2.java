package com.dayadv3;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Abishek jothi Hems");
		System.out.println(s1.charAt(8));
		System.out.println(s1.length());
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.lastIndexOf('A'));
		System.out.println(s1.equals("Abishek jothi hems"));
		System.out.println(s1.equalsIgnoreCase("abishek Jothi hems"));
		System.out.println(s1.compareTo("Abishek jothi Hem"));
		System.out.println(s1.compareToIgnoreCase("Abishek jothi hem"));
		System.out.println(s1.concat("Abishek"));
		System.out.println(s1.endsWith("hek"));
		System.out.println(s1.substring(5,8));
		System.out.println(s1.trim());//to remove the front and back spaces
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toCharArray());
		char[] c = s1.toCharArray();
		
	}

}

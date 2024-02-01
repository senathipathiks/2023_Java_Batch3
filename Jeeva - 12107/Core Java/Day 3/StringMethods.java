package com.corejava.day3;

public class StringMethods {
	public static void main(String[] args) {
	
	
		String s=new String("Durai Singam");
		
		StringBuffer sb=new StringBuffer();
		sb.reverse();
		System.out.println(s.charAt(0)+"1");
		System.out.println(s.lastIndexOf("i"));
		System.out.println(s.length());
		System.out.println();System.out.println();
		System.out.println(s.CASE_INSENSITIVE_ORDER+"  2");
		System.out.println(s.equalsIgnoreCase("Durai Singam")+"  3");
		System.out.println();//System.out.println();
		System.out.println(s.compareTo("Durai Singam")+" 4");
		System.out.println(s.compareToIgnoreCase("edurai Singam"));
		System.out.println();
	
		System.out.println(s.concat("singam"));
		System.out.println(s.contentEquals("Durai Singam"));
		
		System.out.println();
		
		System.out.println(s.endsWith("am"));
		System.out.println(s.substring(2,7));
		
		System.out.println();
		
		System.out.println(s.trim());
	
		int a=10;
	
		String s1=String.valueOf(a);
		
		char[] ch=s.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.day6;
import java.util.StringJoiner;

public class StringJoinerClassEg {

	public static void main(String[] args) {
		
		
	StringJoiner s=new StringJoiner(","); //its a class in util package
//	s.add("html");
//	s.add("css");
//	s.add("css");
//	s.add("");
	s.setEmptyValue("node");
	
	System.out.println(s);
		
		
		
		StringJoiner s1=new StringJoiner("$","\\","/");
		s1.add("Java");
		s1.add(" Python");
		s1.add(" Sq");
		System.out.println(s1);
		
		System.out.println(s1.merge(s1));
		
	
	}

}

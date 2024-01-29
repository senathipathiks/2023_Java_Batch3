package com.Day6;

import java.util.StringJoiner;

public class StringJoinerEg {

	public static void main(String[] args) {
		
		
		StringJoiner s = new StringJoiner(",","[","]");
		
		s.add("java");
		s.add("Python");
		s.add("C#");
		
		System.out.println(s);
		
		StringJoiner s1 = new StringJoiner(",","[","]");
        
		
		s1.add("java");
		s1.add("Python");
		s1.add("C#");
		
		System.out.println(s1.merge(s));
		System.out.println(s);
		
		
	}

}

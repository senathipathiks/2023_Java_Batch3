package com.java8;

import java.util.StringJoiner;

public class StringJoinerEg {

	public static void main(String[] args) {
		
		StringJoiner s = new StringJoiner(",");
		s.add("Raghu");
		s.add("Raveeno");
		s.add("Vinod");
		
		System.out.println(s);
		
		//this function (setEmptyValue) will only show the 
        //value when it StringJoiner is empty
		s.setEmptyValue("jig");
		
		
		StringJoiner s1 = new StringJoiner(";", "$", "/");
		
		s1.add("Raghu");
		s1.add("Raveeno");
		s1.add("Vinod");
		
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.merge(s));
		
	}

}

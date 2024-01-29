package com.day6;
import java.util.StringJoiner;
public class StringJoinerEx {
public static void main(String[] args) {
	
	StringJoiner s = new StringJoiner(",");
//	s.add(" java");
//	s.add(" python");
//	s.add(" C programming");
	s.setEmptyValue("node");
	System.out.println(s);
	
	StringJoiner s1=new StringJoiner("$","\\","/");
	s1.add("Java");
	s1.add("Python");
	s1.add("React JS");
	s1.add("");
	
	System.out.println(s1);
	
//	System.out.println(s1+"\\"+"hello");
//	System.out.println(s1.length());
//	System.out.println(s1.merge(s));
//}
}}

package com.Day6;
import java.util.*;
public class StringJoinerEg {

	public static void main(String[] args) {
		StringJoiner s = new StringJoiner(",");
		s.add("html");
		s.add("css");
		s.add("javascript");
		//s.setEmptyValue("Node.js");
		System.out.println(s);
		StringJoiner s1 = new StringJoiner("'","\\'","'/");
		s1.add("java");
		s1.add("python");
		s1.add("c++");
		System.out.println(s1);
		System.out.println(s1.merge(s));
		System.out.println(s1.length());
		System.out.println(s1.toString());
		System.out.println(s1.add("c"));
		

	}

}

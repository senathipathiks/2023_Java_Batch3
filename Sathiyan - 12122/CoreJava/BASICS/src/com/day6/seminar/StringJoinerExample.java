package com.day6.seminar;
import java.util.*;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		StringJoiner s=new StringJoiner(",");
		s.add("Java");
		s.add("Python");
		s.add("C++");
		System.out.println(s);
		
		StringJoiner s1=new StringJoiner("$", "\\", "/");
		s1.add("Java");
		s1.add("Python");
		s1.add("C++");
//		System.out.println(s1);
		System.out.println(s1.merge(s));
		
		s1.setEmptyValue("node");
		System.out.println(s1);
	}

}

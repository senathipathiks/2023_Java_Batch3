package com.day6Java8;
import java.util.StringJoiner;
public class StringJoinerEg {

	public static void main(String[] args) {
StringJoiner s = new StringJoiner(",");
s.add("java");
s.add("python");
s.add("javascript");
s.add("");

s.setEmptyValue("node");
//System.out.println(s);

StringJoiner s1= new StringJoiner("$","\\","/");
s1.add("css");
s1.add("c++");
s1.add("html");
System.out.println(s);
//System.out.println(s1.merge(s));
	}

}

package com.javacoreday6;

import java.util.StringJoiner;

public class StringJoinerExample1 {

	public static void main(String[] args) {
		
		StringJoiner stringJoiner = new StringJoiner(" ");
		stringJoiner.add("Dharshsun");
		stringJoiner.add("Srinivasan");
		System.out.println("String : "+stringJoiner);
		
		StringJoiner strJoiner = new StringJoiner("-", "<-", "->");
		strJoiner.add("day");
		strJoiner.add("month");
		strJoiner.add("year");
		System.out.println("Date Using String Joiner : "+strJoiner);
		
		System.out.println("Merge two String : "+stringJoiner.merge(strJoiner));
		
		StringJoiner str = new StringJoiner(",");
		str.setEmptyValue("node");
		System.out.println("Using setEmptyValue : "+str);

	}

}

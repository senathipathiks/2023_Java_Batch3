package com.day6;
import java.util.*;
import java.util.Arrays;
import java.util.function.Predicate;

public class FunctionalInterface2 {
public static void main(String[] args) {
	List<String> names= Arrays.asList("Apple","Orange","Own","banana");
	
	Predicate<String> p=(s)->s.startsWith("O");
	
	for (String st : names) {
	 if(p.test(st))
		 System.out.println(st);
	}
}
}

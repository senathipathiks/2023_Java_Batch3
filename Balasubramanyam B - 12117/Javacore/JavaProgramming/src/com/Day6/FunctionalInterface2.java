package com.Day6;


import java.util.*;
import java.util.function.Predicate;
public class FunctionalInterface2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Balu","Bunny");
		Predicate<String> p=(s)->s.startsWith("B");
		for(String st:names) {
			if(p.test(st)) {
				System.out.println(st);
			}
		}
		

	}

}

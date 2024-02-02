package com.day9Collections;

import java.util.*;

public class SetPrg6 {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();
		set.add("sherin");
		set.add("dhanya");
		set.add("kiruba");
		set.add("vino");
		set.add("boomer");

		System.out.println(set);
		System.out.println("------------------------------");
		set.remove("vino");// remove first element
		System.out.println(set);
		System.out.println("------------------------------");
		
		System.out.println("----------------------------");
		System.out.println("Using For loop");

		System.out.println("----------------------------");
		System.out.println("Using For each loop");
		for (String i:set) {
			System.out.println(i+" ");
		}
		System.out.println("----------------------------");
		System.out.println("Using Iterator ");
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");


	}

}}

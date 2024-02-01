package com.day30;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1,10);
		map.put(2,20);
		map.put(3,30);
		map.put(4,40);
		map.put(5,50);
		map.put(6,60);
		
		System.out.println("Key : Value");
		Set<Entry<Integer, Integer>> m = map.entrySet();
		for(Entry<Integer, Integer> i : m)
			System.out.println(i.getKey()+" : "+i.getValue());

		

	}

}

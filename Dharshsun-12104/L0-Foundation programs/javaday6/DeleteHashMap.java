package com.javaday6;

import java.util.HashMap;
import java.util.Set;

public class DeleteHashMap {
	public static void main(String args[]) {
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(10,"add");
		map.put(20,"sub");
		map.put(40,"int");
		map.put(50,"float");
		System.out.println(map);
		map.clear();
		System.out.println(map);
		Set<Integer> set = map.keySet();
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}

}

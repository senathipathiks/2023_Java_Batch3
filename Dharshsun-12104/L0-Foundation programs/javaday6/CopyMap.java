package com.javaday6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CopyMap {
	public static void main(String args[]) {
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(10,"add");
		map.put(20,"sub");
		map.put(40,"int");
		map.put(50,"float");
		Set<Integer> set = map.keySet();
		System.out.println(set);
		
		Set<Entry<Integer,String>> set1 = map.entrySet();
		System.out.println(set1);
		Iterator<Entry<Integer,String>> it1 = set1.iterator();
		while(it1.hasNext()) {
			Entry<Integer,String> entry = it1.next();
			System.out.println("key:" +entry.getKey()+ " Value:" +entry.getValue());
		}
		}
	}



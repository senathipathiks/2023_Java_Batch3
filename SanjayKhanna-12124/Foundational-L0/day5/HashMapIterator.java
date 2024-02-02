package com.day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterator {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "Four");
		System.out.println("Map : "+map);
		//Iterator Using KeySet()
		System.out.println("Iterator() : ");
		for(Integer i:map.keySet()) {
			System.out.println("Key : "+i+" Value : "+map.get(i));
		}
		//Using Entry()
		
		Set<Entry<Integer, String>> set = map.entrySet();
		System.out.println("EntrySet() : "+set);
		Iterator<Entry<Integer, String>> it = set.iterator();
		System.out.println("Iteration using entryset()  : ");
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}

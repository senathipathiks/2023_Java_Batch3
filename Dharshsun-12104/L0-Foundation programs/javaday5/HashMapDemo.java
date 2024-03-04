package com.javaday5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(10,"java");
		map.put(11,"C++");
		map.put(12,"python");
		map.put(13,"node js");
		System.out.println(map);
		
		map.remove(10);
		System.out.println(map);

		System.out.println(map.get(13));
		
		Set<Integer> set = map.keySet();
		System.out.println(set);
		Iterator<Integer> it= set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(" key: " +key+  " value: " +map.get(key));
		}
		for(Integer key:set) {
			System.out.println(" key: " +key+  " value: " +map.get(key));
		}
		//way-2
		Set<Entry<Integer,String>> set1 = map.entrySet();
		System.out.println(set1);
		Iterator<Entry<Integer,String>> it1 = set1.iterator();
		while(it1.hasNext()) {
			Entry<Integer,String> entry = it1.next();
			System.out.println("key:" +entry.getKey()+ " Value:" +entry.getValue());
		}
		for(Entry<Integer, String> entry : set1) {
			System.out.println(" key: "+ entry.getKey() +" Value: "+entry.getValue());
		}
		
		}
}


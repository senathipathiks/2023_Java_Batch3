package com.day5;

import java.util.*;
import java.util.Map.Entry;

public class Hmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(10, "python");
		map.put(20, "c");
		map.put(30, "c++");
		map.put(40, "sql");
		map.put(50, "java");
		System.out.println(map);
		map.put(10, "Php");
		System.out.println(map);
		map.remove(10);
		System.out.println(map);
		System.out.println(map.get(10));
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("key: "+ key+"Value"+map.get(key));
		}
		System.out.println("--------------keys--------------");
		
		for(Integer i:set) {
			System.out.println("key: "+ i+" Value: "+map.get(i));
		}
		System.out.println("-------------values-----------------");	
		
		Collection<String> set1 =map.values();
		for(String i:set1) {
			System.out.println(i);
			
		System.out.println("---using iteration while Entry=Key and Vavues----");
		
		Set<Entry<Integer,String>> Set3=map.entrySet();
//		way-1
		Iterator<Entry<Integer,String>> it4= Set3.iterator();
		while(it4.hasNext()) {
			Entry<Integer,String> entry= it4.next();
			System.out.println("key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		System.out.println("---using iteration forEach Entry=Key and Vavues----");
		
//		way-2
		for( Entry<Integer,String> entryi:Set3) {
			System.out.println("key: "+entryi.getKey()+" Value: "+entryi.getValue());
		
		
		}
	}

	}}

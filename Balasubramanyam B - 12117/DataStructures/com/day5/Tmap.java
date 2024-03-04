package com.day5;
import java.util.*;
import java.util.Map.Entry;
public class Tmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();
    map.put(10, "python");
	map.put(20, "c");
	map.put(30, "c++");
	map.put(40, "sql");
	map.put(50, "java");
	System.out.println(map);
	System.out.println(map.put(10, "JavaScript"));
	System.out.println(map);
	map.remove(10);
	System.out.println(map);
	System.out.println("---------------------using While keyset---------------------");
	Set<Integer> set=map.keySet();
	Iterator<Integer> it=set.iterator();
	while(it.hasNext()) {
		Integer key = it.next();
		System.out.println("keys: "+key+" values: "+map.get(key));
	}
	System.out.println("---------------------using forEach keyset---------------------");
	for(Integer i:set) {
		System.out.println("keys: "+i+" values: "+map.get(i));
	}
	System.out.println("---------------------using while Entry = key + values---------------------");
	Set<Entry<Integer,String>>  set1 =    map.entrySet();
	Iterator<Entry<Integer,String>>it1=set1.iterator();
	while(it1.hasNext()) {
		Entry<Integer,String>entry = it1.next();
		System.out.println("keys: "+entry.getKey()+" values: "+entry.getValue());
	}
	System.out.println("---------------------using forEach Entry = key + values---------------------");
	
	for(Entry<Integer,String> i:set1) {
		System.out.println("keys: "+i.getKey()+" values: "+i.getValue());
	
	}
}}

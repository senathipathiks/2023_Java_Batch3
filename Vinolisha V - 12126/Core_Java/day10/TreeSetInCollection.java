package com.day10;

import java.util.Collections;
import java.util.TreeMap;

public class TreeSetInCollection {

	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(10,"tiger");
		map.put(20, "lion");
		map.put(30, "monkey");
		map.put(40, "elephant");
		
		System.out.println(map);
		
		TreeMap<Integer, String> map1=new TreeMap<Integer, String>(Collections.reverseOrder());
		
		map1.put(10,"tiger");
		map1.put(20, "lion");
		map1.put(30, "monkey");
		map1.put(40, "elephant");
		System.out.println("reverse:" +map1);
		
		
		

	}

}

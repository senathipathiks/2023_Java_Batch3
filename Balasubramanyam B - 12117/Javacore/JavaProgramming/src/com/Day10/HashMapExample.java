package com.Day10;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Balu");
		map.put(2, "Ganesh");
		map.put(3, "Jyothi");
		map.put(4, "Kiruba");
		map.put(null, null);
		map.put(4, "Sathish");
		map.put(5, "Sundhar");
		System.out.println(map);
		System.out.println(map.get(1));
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}

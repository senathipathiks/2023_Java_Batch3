package com.Day10;
import java.util.*;
public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "Balu");
		map.put(2, "Loki");
		map.put(3, "Jothi");
		map.put(4, "Santhosh");
		map.put(5, null);
		map.put(5, "Ram");
		System.out.println(map);
		
		System.out.println(map.get(1));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}
	}



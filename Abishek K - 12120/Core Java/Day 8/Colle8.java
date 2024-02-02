package com.day8;

import java.util.HashMap;
import java.util.*;
public class Colle8 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Abishek");
		map.put(2, "Abinaya");
		map.put(3, "Kumar");
		map.put(4, "Maha");
		map.put(null, null);
		map.put(2, "Abinaya Kumar");
		System.out.println(map);
		
		System.out.println(map.get(1));
		
		for(Map.Entry<Integer,String> m:map.entrySet()){
			System.out.println(m.getKey()+ " "+m.getValue());
		}

	}

}

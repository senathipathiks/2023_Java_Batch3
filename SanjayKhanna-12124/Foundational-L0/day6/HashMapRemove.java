package com.day6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapRemove {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer, String>();
		int key;
		String value;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Map size: ");
		int size=sc.nextInt();
		System.out.println("Enter Key value: ");
		for (int i = 0; i < size; i++) {
		key=sc.nextInt();
		value=sc.next();
		map.put(key, value);
		}
		System.out.println("Map : "+map);
		map.clear();
		System.out.println("After Removing all element in Map : "+map);
	}

}

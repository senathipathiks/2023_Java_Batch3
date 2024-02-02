package com.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEmpty {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer, String>();
		int key;
		String value;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Map size: ");
		int size=sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Key-value: ");
			key=sc.nextInt();
			value=sc.next();
			map.put(key, value);
		}
		if(map.isEmpty())
			System.out.println("Map is Empty");
		else
			System.out.println("Map is Not Empty");
	}

}

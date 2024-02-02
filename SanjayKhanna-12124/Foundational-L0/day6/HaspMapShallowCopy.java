package com.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HaspMapShallowCopy {
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
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
		map1=(HashMap)map.clone();
		System.out.println("Map : "+map);
		System.out.println("Copied Map : "+map1);

}
}

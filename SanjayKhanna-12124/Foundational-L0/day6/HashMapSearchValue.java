package com.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapSearchValue {

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
		System.out.println("Enter the Search value : ");
		String elem = sc.next();
		boolean flag=false;
		for(Integer i:map.keySet()) {
			if(elem.compareTo(map.get(i))==0) {
				flag=true;
				System.out.println("Value is Present at key : "+i);
				break;
			}

	}
		if(flag==false) {
			System.out.println("Value is not Present");
		}

}
}

package com.day5;

import java.util.*;

public class Hset {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(10);
		System.out.println(set);
		System.out.println("size is: " + set.size());
		set.forEach(e -> System.out.println(e));
		System.out.println("--------------------------------------------------");

//	way-1
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------------------");

//		way-2
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

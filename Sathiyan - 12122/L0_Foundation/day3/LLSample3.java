package com.day3;

import java.util.LinkedList;

public class LLSample3 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(30);
		System.out.println(ll);
		ll.add(1, 60);
		System.out.println(ll);
	}

}

package com.javacoreday9collections;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> arr= new LinkedList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(40);
		arr.add(30);
		arr.addAll(arr);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		arr.remove(4);
		System.out.println(arr);
		
		System.out.println(arr.get(2));
//		arr.clear();
		System.out.println(arr);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i)+" ");
		}
		System.out.println("----------------");
		for(Integer i : arr) {
			System.out.println(i+" ");
		}
		System.out.println();
		Iterator<Integer> itr=arr.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		
		
		
		
	}
}



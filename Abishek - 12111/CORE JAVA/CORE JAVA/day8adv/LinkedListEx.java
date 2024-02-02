package com.day8adv;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> arr = new LinkedList<Integer>();
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.addAll(arr);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);
		System.out.println(arr.get(6));
//		arr.removeAll(arr);
//		System.out.println(arr);
//		for(int i=0;i<arr.size();i++)
//		{
//			System.out.print(arr.get(i)+" ");
//		}
		
		for(Integer i:arr) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		Iterator<Integer> itr = arr.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
	}

}

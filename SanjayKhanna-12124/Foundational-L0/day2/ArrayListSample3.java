package com.day2;

import java.util.ArrayList;//Predefined class
import java.util.Iterator;// Predefined interface

public class ArrayListSample3 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("List : "+list);                     //Way1
		System.out.print("Using For Loop : ");					//Way2
		for(int i=0;i<list.size();i++)							
			System.out.print(list.get(i)+" ");
		System.out.println();
		System.out.print("Using For Each Loop : ");
		for(int i:list)											//Way3
			System.out.print(i+" ");
		System.out.println();
		System.out.print("Using Iterator : ");					//Way4
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}
}

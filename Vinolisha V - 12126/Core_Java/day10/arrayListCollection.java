package com.day10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayListCollection {

	public static void main(String[] args) {
		 
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(40);
		arr.add(30);
		
		//arr.addAll(arr);
		//System.out.println(arr);//[10, 20, 40, 30, 10, 20, 40, 30]
		
		Collections.sort(arr);
		System.out.println(arr);//give output accending order [10, 20, 30, 40]
		
//		arr.remove(3);
//		System.out.println(arr);//[10, 20, 30]
		
		System.out.println(arr.get(2));
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i)+" ");
		}
		
		System.out.println();
		
		for (Integer integer : arr) {
			System.out.println(integer+ " ");
		}
		
		System.out.println("Iterator");
		for (Iterator iterator = arr.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		

	}

}

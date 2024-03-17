package com.corecollection;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.addAll(arr);

		System.out.println(arr);

		Collections.sort(arr);

		System.out.println(arr);
		arr.remove(4);

		System.out.println(arr);

		System.out.println(arr.get(2));

		for (int i = 0; i < arr.size(); i++) {

			System.out.print(arr.get(i) + " ");

		}

		for (Integer i : arr) {

			System.out.print(i + " ");

		}
		
		Iterator<Integer> itr=arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

	}

}

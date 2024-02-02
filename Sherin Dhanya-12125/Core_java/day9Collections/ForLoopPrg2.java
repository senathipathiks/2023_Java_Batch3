package com.day9Collections;

import java.util.*;

public class ForLoopPrg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(91);
		arr.add(12);
		arr.add(3);
		arr.add(7);
		//arr.addAll(arr);
		System.out.println(arr);
		System.out.println("----------------------------");
		System.out.println("Using For loop");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("----------------------------");
		System.out.println("Using For each loop");
		for (Integer i:arr) {
			System.out.println(i+" ");
		}
		System.out.println("----------------------------");
		System.out.println("Using Iterator ");
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
	}

}

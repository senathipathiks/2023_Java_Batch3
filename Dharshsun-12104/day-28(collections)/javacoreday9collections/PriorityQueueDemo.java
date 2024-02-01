package com.javacoreday9collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> arr= new PriorityQueue<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(40);
		arr.add(30);
		System.out.println(arr.peek());
		System.out.println(arr.poll());
		System.out.println(arr.peek());
		//arr.addAll(arr);
		System.out.println(arr);
		
//		Collections.sort(arr);
//		System.out.println(arr);
//		arr.remove(4);
//		System.out.println(arr);
//		
//		System.out.println(arr.get(2));
////		arr.clear();
//		System.out.println(arr);
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i)+" ");
//		}
//		System.out.println("----------------");
//		for(Integer i : arr) {
//			System.out.println(i+" ");
//		}
//		System.out.println();
//		Iterator<Integer> itr=arr.iterator();
//		while(itr.hasNext()){
//			System.out.print(itr.next()+" ");
//		}
//		
		
	}
}

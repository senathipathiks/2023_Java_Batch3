package com.day9Collections;

import java.util.*;

public class QueueListPrg5 {

	public static void main(String[] args) {
		Queue<String> queue= new PriorityQueue<String>();
		queue.offer("sherin");
		queue.offer("dhanya");
		queue.offer("kiruba");
		queue.offer("vino");
		queue.offer("boomer");

		System.out.println(queue);
		System.out.println("------------------------------");
		queue.poll();// remove first element
		System.out.println(queue);
		System.out.println("------------------------------");
		
		System.out.println(queue.peek());// return first element
//		System.out.println("------------------------------");
//		
//		System.out.println("----------------------------");
	//	System.out.println("Using For loop");
//		for(;int i<queue.size()>0;) {
//			System.out.println(queue.poll(i));
//		}
		System.out.println("----------------------------");
		System.out.println("Using For each loop");
		for (String i:queue) {
			System.out.println(i+" ");
		}
		System.out.println("----------------------------");
		System.out.println("Using Iterator ");
		Iterator<String> it=queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");

	}

}}

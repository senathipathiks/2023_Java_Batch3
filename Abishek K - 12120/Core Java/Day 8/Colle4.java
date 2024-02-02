package com.day8;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Colle4 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> qu = new PriorityQueue<Integer>();
		qu.add(10);
		qu.add(70);
		qu.add(80);
		qu.add(110);
		qu.add(140);
		System.out.println(qu);
		
		qu.poll();
		System.out.println(qu);
		
		System.out.println();
		//for-each
		System.out.println("for-each");
		for(int i: qu) {
			System.out.println(i);
		}
		System.out.println();
		
		//Iterator
		System.out.println("Iterator");
		Iterator<Integer> it = qu.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}

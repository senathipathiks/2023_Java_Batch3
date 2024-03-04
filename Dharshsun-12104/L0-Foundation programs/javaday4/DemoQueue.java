package com.javaday4;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
//singly ended queue
public class DemoQueue {
	public static void main(String args[]) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		queue1.offer(10);
		queue1.offer(20);
		queue1.offer(30);
		queue1.offer(40);
		queue1.offer(50);
		
		System.out.println(queue1);
		queue1.poll();
		System.out.println(queue1);
		System.out.println(queue1.peek());
		
		for(Integer i : queue1) {
			System.out.println(i);
			
		Iterator<Integer> it = queue1.iterator();
		while(it.hasNext()) 
			System.out.println(it.next());
		
		System.out.println("\n--------------------");
		for(;queue1.size()>0;) {
			System.out.println(queue1.poll());
			System.out.println(queue1);
		}
		}
	}

}

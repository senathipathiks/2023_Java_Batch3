package com.day4;

import java.util.*;

public class QueueSampleIterating {

	public static void main(String[] args) {
		Queue<Integer> queue1=new LinkedList<>();
		queue1.offer(10);
		queue1.offer(20);
		queue1.offer(30);
		queue1.offer(40);
		queue1.offer(50);
		
		System.out.println(queue1);//10,20,30,40,50
		queue1.remove();//Removing the firts elements
		System.out.println(queue1);//20,30,40,50
		System.out.println(queue1.peek());//20
		
		
		
		System.out.println("Way-1");
		for (Integer i : queue1) {
			System.out.println(i);
		}
		
		/*
		 * By using Iterator method we can show the output
		 */
		System.out.println("Way-2");
		Iterator<Integer> it=queue1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		/*
		Poll remove all the elements after showing Like Pop 
		So only normal For loop is used at the last.
		*/
		System.out.println("Way-3");
		for (;queue1.size()>0;) {
			System.out.println("Element is going to removed : "+queue1.poll());
			System.out.println("After removing elements : "+queue1);
		}
	}

}

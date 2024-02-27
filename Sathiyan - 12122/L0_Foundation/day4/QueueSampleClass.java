package com.day4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSampleClass {

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
	}
}

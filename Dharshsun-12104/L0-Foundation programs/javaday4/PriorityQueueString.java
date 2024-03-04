package com.javaday4;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueString {
	public static void main(String args[]) {
		Queue<String> queue1 = new PriorityQueue<>();//gives priority in descending order
		queue1.offer("red");
		System.out.println(queue1);
		
		queue1.offer("blue");
		System.out.println(queue1);
		
		queue1.offer("green");
		System.out.println(queue1);
		
		queue1.offer("yellow");
		System.out.println(queue1);

}
}

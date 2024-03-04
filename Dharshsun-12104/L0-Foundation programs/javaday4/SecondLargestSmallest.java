package com.javaday4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SecondLargestSmallest {
	public static void main(String args[]) {
		//finding largest and smallest element in a queue
		
		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		
		queue1.offer(10);
		queue1.offer(20);
		queue1.offer(30);
		queue1.offer(40);
		queue1.offer(50);
		queue1.offer(60);
		System.out.println(queue1);
		
		Object arr[] = queue1.toArray();
		Arrays.sort(arr);
		System.out.println("Second Smallest "+arr[1]);
		System.out.println("Second Biggest "+arr[arr.length-2]);
		
}
}

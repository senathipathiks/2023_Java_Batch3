package com.javaday4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SecondSmallestElementQueue {
	public static void main(String args[]) {
		//finding second smallest element in a queue logical big loop
		
		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		queue1.offer(10);
		queue1.offer(20);
		queue1.offer(30);
		queue1.offer(40);
		queue1.offer(50);
		queue1.offer(60);
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int num: queue1) 
        {
			if (num < smallest)
			{
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest)
			{
				secondSmallest = num;
			}
		}
 System.out.println(secondSmallest);
        }
}
	
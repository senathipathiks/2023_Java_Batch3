package com.day4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSum {

	public static void main(String[] args) {
		Queue<Integer> queue1=new LinkedList<>();
		queue1.add(10);
		queue1.add(20);
		queue1.add(30);
		queue1.add(40);
		queue1.add(50);
		int sum=0,sum1=0;
		
		System.out.println(queue1);
		
		for (Integer i : queue1) {
			sum+=i;
		}
		System.out.println("Way-1 = "+sum);
		
		for (; queue1.size() > 0;) {
			sum1+=queue1.poll();
		}
		System.out.println("Way-2 = "+sum1);
	}
}

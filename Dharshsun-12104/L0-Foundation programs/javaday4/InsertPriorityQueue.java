package com.javaday4;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class InsertPriorityQueue {
	public static void main(String args[]) {
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.offer(10);
		q1.offer(80);
		q1.offer(90);
		q1.offer(30);
		q1.offer(40);
		q1.offer(40);
		System.out.println("enter The element to be added in queue ");
		Scanner sc = new Scanner(System.in);
		int val=sc.nextInt();
	   q1.offer(val);
	   System.out.println(" The element added in queue: " +q1);
		
		

	}

}

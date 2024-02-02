package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueCopy {

	public static void main(String[] args) {
		Queue<Integer>queue = new PriorityQueue<Integer>();
		Queue<Integer>queue1 = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue1 : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements :");
		for(int i=0;i<size;i++) {
		queue.offer(sc.nextInt());
		}
		System.out.println("Enter Size of Queue2 : ");
		int size1 = sc.nextInt();
		System.out.println("Enter Elements :");
		for(int i=0;i<size1;i++) {
		queue1.offer(sc.nextInt());
		}
		
		System.out.println("Queue1 : "+queue);
		System.out.println("Queue2 : "+queue1);
		for(Integer i:queue) {
			queue1.offer(i);
		}
		System.out.println("Queue2 after Adding Queue1 & Queue : "+queue1);
	}

}

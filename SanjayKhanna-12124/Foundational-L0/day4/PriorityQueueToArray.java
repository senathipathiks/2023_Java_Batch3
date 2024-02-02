package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueToArray {

	public static void main(String[] args) {
		Queue<Integer>queue = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements :");
		for(int i=0;i<size;i++) {
		queue.offer(sc.nextInt());
		}
		System.out.println("Queue : "+queue);
		Object[] arr=queue.toArray();
		for(Object i:arr) {
			System.out.print(" "+i);
		}
		}

	}



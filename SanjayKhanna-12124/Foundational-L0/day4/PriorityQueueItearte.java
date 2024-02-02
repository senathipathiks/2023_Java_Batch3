package com.day4;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueItearte {

	public static void main(String[] args) {
		Queue<Integer>queue = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		queue.offer(sc.nextInt());
		}
		System.out.println();
		System.out.print("Iterated using Iterator : ");
		Iterator<Integer> it=queue.iterator();		//Iterating using iterator
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println(queue.getClass());

	}

}

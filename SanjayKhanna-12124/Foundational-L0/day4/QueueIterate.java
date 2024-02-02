package com.day4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueIterate {

	public static void main(String[] args) {
		Queue<Integer> queue= new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		queue.offer(sc.nextInt());
		}
		System.out.println("Queue :"+queue);
		System.out.print("Using Iterator : ");					//Way1
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.print("Using For each : ");					//Way2
		for(Integer i : queue) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.print("Using For loop : ");					//Way3
		for(;queue.size()>0;) {
			System.out.print(queue.poll()+" ");
		}
		
	}

}

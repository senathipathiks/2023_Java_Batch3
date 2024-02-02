package com.day4;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueString {

	public static void main(String[] args) {
		Queue<String>queue = new PriorityQueue<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		queue.offer(sc.next());
		}
		System.out.println();
		System.out.print("Output :");
		for(String s:queue) {
			System.out.print(" "+s);
		}

	}

}

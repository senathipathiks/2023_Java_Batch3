package com.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueSum {

	public static void main(String[] args) {
		Queue<Integer> queue= new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		queue.offer(sc.nextInt());
		}
		int sum=0;
		for(Integer i : queue) {
			sum+=i;
		}
		System.out.println("Queue :"+queue);
		System.out.println("Sum : "+sum);

	}

}

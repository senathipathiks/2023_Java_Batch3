package com.day4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeSample2 {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++) {
		deque.addFirst(sc.nextInt());
		}
		System.out.println("Deque : "+deque);
		System.out.print("Display In reverse order using pollLast() : ");
		for(int i=0;i<size;i++) {
			System.out.print(deque.removeLast()+" ");
		}
		//Deque<Integer> deque1 = new ArrayDeque<Integer>();
		//System.out.println(deque1.retainAll(deque));

	}

}

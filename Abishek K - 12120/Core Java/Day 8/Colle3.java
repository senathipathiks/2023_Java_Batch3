package com.day8;

import java.util.Iterator;
import java.util.Stack;

public class Colle3 {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(50);
		st.push(30);
		st.push(90);
		st.push(8);
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		
		//System.out.println(st.peek());
		
		//for-loop
		for(int i=1;i<=4;i++) {
			//System.out.println("For-loop");
			//System.out.println(st.peek());
			//st.pop();
		}
		
		System.out.println();
		//for-each
		System.out.println("for-each");
		for(int i: st) {
			System.out.println(i);
		}
		System.out.println();
		
		//Iterator
		System.out.println("Iterator");
		Iterator<Integer> it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

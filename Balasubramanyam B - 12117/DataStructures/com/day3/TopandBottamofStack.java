package com.day3;

import java.util.Comparator;
import java.util.Stack;

public class TopandBottamofStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
	    System.out.println(stack);
	    int bottom =-1;
	    System.out.println(stack.peek()+" :is top");
	    if(! stack.isEmpty()) {
	     while(stack.size()	>1) {
	    	 stack.pop();
	     }
	     bottom=stack.peek();
	     
	     }
	    System.out.println(bottom + " :the bottom");
	    
	    

	}
	
	}

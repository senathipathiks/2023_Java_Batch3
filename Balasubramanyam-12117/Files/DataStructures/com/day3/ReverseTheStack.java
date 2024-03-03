package com.day3;
import java.util.*;
public class ReverseTheStack {
     public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println("Before reverse the stack elements:"+stack);
		System.out.println("After reverse the stack elements:");
		for(int i=stack.size()-1;i>=0;i--) {
			int k = stack.get(i);
			System.out.print(k+" ");
			}
		
			}}
		

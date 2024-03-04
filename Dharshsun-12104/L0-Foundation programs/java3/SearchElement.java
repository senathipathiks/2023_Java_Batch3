package com.java3;
import java.util.Stack;

public class SearchElement {
	
	 public static void main (String args[]) {
	      Stack<String> stack = new Stack<String>();
	      stack.push("Apple");
	      stack.push("Mango");
	      stack.push("Pear");
	      stack.push("Orange");
	      stack.push("Guava");
	      System.out.println("The stack elements are: " + stack);
	      System.out.println("The element Mango is in the stack at position: " + stack.search("Mango"));
	      System.out.println("The element Peach is in the stack at position: " + stack.search("Strawberry"));
	   }
	}



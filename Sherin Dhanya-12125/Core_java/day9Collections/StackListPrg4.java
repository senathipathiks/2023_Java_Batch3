package com.day9Collections;

import java.util.Collections;
import java.util.*;

public class StackListPrg4 {

	public static void main(String[] args) {
		Stack<String> stack= new Stack<String>();
		stack.push("sherin");
		stack.push("dhanya");
		stack.push("kiruba");
		stack.push("vino");
		stack.push("boomer");

		System.out.println(stack);
		System.out.println("------------------------------");
		stack.pop();// remove first element
		System.out.println(stack);
		System.out.println("------------------------------");
		
		System.out.println(stack.peek());// return last element
		System.out.println("------------------------------");
		System.out.println(stack.get(2));


	}

}

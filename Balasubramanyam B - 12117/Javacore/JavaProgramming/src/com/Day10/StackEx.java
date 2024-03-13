
package com.Day10;
import java.util.*;
public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(60);
        stack.push(50);
        System.out.println(stack);
        Collections.sort(stack);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);
        System.out.println(stack.get(1));
        System.out.println(stack);
	}

}

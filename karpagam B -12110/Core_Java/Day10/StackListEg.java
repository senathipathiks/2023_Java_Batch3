package Com.Day10;

import java.util.Stack;

public class StackListEg {

	public static void main(String[] args) {
		
	Stack<Integer> stack = new Stack<Integer>();

	stack.push(10);
	stack.push(20);
	stack.push(30); // insert element*/
    System.out.println(stack);
    System.out.println("---------------");
	stack.pop();// remove top of the element and return others
	System.out.println(stack);
    System.out.println("---------------");
    System.out.println(stack.peek()); // return the top of the element.
	System.out.println(stack);
    System.out.println("---------------");

	System.out.println(stack.get(0));
				
}
}


package CorejavaDay10;

import java.util.*;

public class CollectionEx3Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack=new Stack<String>();
		stack.push("Vishnu");
		stack.push("Surya");
		stack.push("Venkat");
		stack.push("Mohana");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		
		System.out.println(stack.get(0));
	}

}

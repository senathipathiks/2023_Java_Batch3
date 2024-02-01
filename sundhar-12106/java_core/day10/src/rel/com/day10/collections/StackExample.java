package rel.com.day10.collections;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		
		s.push("Sundhar");
		s.push("PremKumar");
		s.push("Srinivasan");
		System.out.println(s);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.get(0));
	}

}

package Day10;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack<String> stack=new Stack<String>();
      stack.push("Sathish");
      stack.push("sowmi");
      stack.push("Kalpana");
      stack.push("kaviya");
      System.out.println(stack);
      stack.pop();
      System.out.println(stack);
      System.out.println(stack.peek());
      
      System.out.println(stack.get(0));
	}

}

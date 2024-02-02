package Day10;

import java.util.Stack;

public class Stackdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<String>();
		st.push("Ram");
		st.push("Ranjitha");
		st.push("Ranjani");
		System.out.print(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.get(0));
	}

}

package day_10;

import java.util.Collections;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer>s1=new Stack<Integer>();
		s1.push(11);
		s1.push(28);
		s1.push(27);
		s1.push(25);
		s1.push(16);
		s1.push(5);
		s1.push(30);
		
		System.out.println(s1);
		Collections.sort(s1);
		System.out.println(s1);
		
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.remove(1));
		System.out.println(s1);
	}

}

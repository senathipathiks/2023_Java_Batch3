package com.corecollection;
import java.util.*;
public class StackEX {
	
	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		s.push("vicky");
		s.push("sanju");
		s.push("vishnu");
		
		System.out.println(s);
		s.pop();
		
		System.out.println(s.peek());
		
		System.out.println(s.get(0));
		
	}

}

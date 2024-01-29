package com.Day6;

interface MethodRef{
	
	Msg getMessage(String s);
}

class Msg{
	public Msg(String s) {
		
		System.out.println(s);
	}

	
}

public class constructorRef {
	
	
	public static void main(String[] args) {
		
		MethodRef m = Msg::new;
		m.getMessage("hello");
	
		
		
		
		
	

	}

}

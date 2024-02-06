package com.day23;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Java Programming");
		str.append(" Language");
		System.out.println("String : "+str);
		str.replace(0, 5,"MySQL ");
		System.out.println("After Replace : "+str);
		
	}

}

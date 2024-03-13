package com.Day3;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Java");
		System.out.println(s.append(" Programming"));
//        System.out.println(s.reverse());
//        System.out.println(s.length());
        System.out.println(s.insert(5, "is a "));
        System.out.println(s.replace(0, 4, "Python"));
	}

}

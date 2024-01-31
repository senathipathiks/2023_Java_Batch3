package com.day2;

public class StrinBuffer {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Durgesh");
		System.out.println(s1.append(" Nandhini "));
//		System.out.println(s1.reverse());
		System.out.println(s1.length());
		System.out.println(s1.insert(17, "Murugan"));
		System.out.println(s1.replace(0, 1, "M D"));
	}

}

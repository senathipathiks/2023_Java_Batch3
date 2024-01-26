package com.day5;

public class CheckedException {

	public static void main(String[] args) {
		/*try {
			Class temp=Class.forName("com.day5.ArrayObject");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e); */
		
		int a[]=new int[5];
		String s="Name";
		try {
			a[1]=Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

package com.day25;

public class ExceptionExample4 {

	public static void main(String[] args) {
		int a[] = new int[5];
		String s = "name";
		
		try {
			a[0] = Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is Finally Method");
		}
	}

}

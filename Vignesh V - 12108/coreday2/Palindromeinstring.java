package com.coreday2;

public class Palindromeinstring {

	public static void main(String args[]) {
		String myString = "anna";
		StringBuffer buffer = new StringBuffer(myString);
		buffer.reverse();
		String data = buffer.toString();
		if (myString.equals(data)) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}
	}
}

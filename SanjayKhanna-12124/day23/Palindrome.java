package com.day23;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Palindrome : ");
		String str = sc.next();
		StringBuilder revStr = new StringBuilder();
		revStr.append(str);
		revStr.reverse();
		if(str.equals(revStr.toString())){
			System.out.println("This is a Palindrome String");
		}
		else {
			System.out.println("This is not a Palindrome String");
		}
		sc.close();
	}

}

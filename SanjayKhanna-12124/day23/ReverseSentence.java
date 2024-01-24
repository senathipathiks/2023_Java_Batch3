package com.day23;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		String[] s = str.split(" ");
		System.out.print("\nReveese content : ");
		for(int i=s.length-1;i>=0;i--)
			System.out.print(s[i]+" ");
		sc.close();
	}

}

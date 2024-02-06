package com.day23;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCharacterString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			int count = 0;
			for(int j= i+1;j<str.length();j++)
				if(str.charAt(i)==str.charAt(j))
					count++;
			if(count>0)
				set.add(str.charAt(i));
		}
		System.out.println("Duplicate Character : "+set.toString());
		sc.close();
	}

}

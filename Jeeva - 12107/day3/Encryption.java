package com.corejava.day3;

public class Encryption {
	public static void main(String[] args) {
		
		
	String s = "java";
	
	StringBuilder sb = new StringBuilder();
		
	
	for (char c: s.toCharArray()) {
		
		if(Character.isLetter(c)) {
			
		   int value = Character.toLowerCase(c) - 'a'; // Convert in compile time Char to Int
		   
		   sb.append(value).append(" ");
		   
		   
		}
		
	}
	
	System.out.println(sb);
		
		
	}

}

package com.day3;
import java.util.*;
public class StringEncryption {
	public static String encrypt(String input) {
		StringBuilder output = new StringBuilder();
	    for (int i = 0; i < input.length(); i++) {
	        int asciiValue = (int) input.charAt(i);
	        output.append(asciiValue);
	        output.append((char) (asciiValue + 1));
	    }
	    return output.toString();
	}
//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Message: ");
	    String input = sc.nextLine();
	    String encrypted = encrypt(input);
	    System.out.println("Encrypted string: " + encrypted);
	}}
		
				
//				String s = "sundhar123";
//				char cArr[] = s.toCharArray();
//				String encryptVal = "";
//				
//				for (int i = 0; i < s.length(); i++) {
//					
//					encryptVal +=  Character.toLowerCase(s.charAt(i))-'a'+1;
//				}
//				System.out.println(encryptVal);
//				
//			}

		


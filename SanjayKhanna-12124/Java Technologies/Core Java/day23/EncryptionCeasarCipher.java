package com.day23;

import java.util.Scanner;

public class EncryptionCeasarCipher {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		System.out.println("Enter the key:");
		int key = sc.nextInt();
		StringBuilder cipher = new StringBuilder();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<str.length();i++) {
			int index = alpha.indexOf(str.charAt(i));
			
			cipher.append(alpha.charAt((index+key)%26));
		}
		System.out.println("Plain Text : "+str);
		System.out.println("Cipher Text : "+cipher);
		sc.close();

	}

}

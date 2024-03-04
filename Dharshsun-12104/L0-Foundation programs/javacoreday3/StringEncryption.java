package com.javacoreday3;

public class StringEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "Dharshsun";

	        StringBuilder encryptedText = new StringBuilder();




	        for (char c : text.toCharArray()) {

	            if(Character.isLetter(c)) {




	                int value = Character.toLowerCase(c) - 'a';

	                encryptedText.append(value).append(" ");

	            } else {

	                encryptedText.append(c);

	            }

	        }




	        System.out.println("Original Text: " + text);

	        System.out.println("Encrypted Text: " + encryptedText.toString());

	    }
}



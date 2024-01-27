package com.day5;


public class FileException2 {
	public static void main(String[] args) {
		
		try {
			Class temp=Class.forName("com.day5.Class");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
}}

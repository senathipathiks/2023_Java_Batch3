package com.javacoreday5;

import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a=10,b=0;
		try {
		int c=a/b;}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(a);
		
	}

}

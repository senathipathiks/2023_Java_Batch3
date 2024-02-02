package com.day25;

import java.io.*;

public class ExceptionExample3 {

	public static void main(String[] args)throws IOException {
		
		try {
			Class<?> temp = Class.forName("com.day25.InterfaceExample");
			System.out.println(temp.toString());
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}

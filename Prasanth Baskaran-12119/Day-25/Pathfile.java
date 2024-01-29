package com.day7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Pathfile {

	public static void main(String[] args) {
		
		var path = "D:\\Demo.txt";
		
		try {
			
		Path check	= Files.writeString(Path.of(path),"Write Method Testing ", StandardOpenOption.APPEND);
		String data = Files.readString(Path.of(path));
		System.out.println(data);
		
		System.out.println(check);
		
//		if(check.equals(path)) {
//			
//			System.out.println("String is added in file");
//		}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}

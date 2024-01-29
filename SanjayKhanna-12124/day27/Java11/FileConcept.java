package com.day27.Java11;

import java.io.IOException;
import java.nio.file.*;

public class FileConcept {

	public static void main(String[] args) {
		
		var path = "D:\\java.txt";
		
		try {
			Files.writeString(Path.of(path),"\nThis is Sanjay Khanna" ,StandardOpenOption.APPEND);
			String data = Files.readString(Path.of(path));
			System.out.println(data);
		} catch (IOException e) {
			System.out.println(e);
		}
		

	}

}

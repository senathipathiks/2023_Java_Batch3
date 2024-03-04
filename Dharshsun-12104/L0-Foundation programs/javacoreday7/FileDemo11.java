package com.javacoreday7;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo11 {
	public static void main(String args[]) {
		var path = "D:\\java core notes.txt";
		try {
			String data = Files.readString(Path.of(path)); //inbuild function to check path
			System.out.println(data);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

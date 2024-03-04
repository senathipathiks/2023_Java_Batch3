package com.javacoreday7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileWriteDemo11 {
	public static void main(String args[]) {
		var path = "D:\\java core notes.txt";
		try {
			Files.writeString(Path.of(path),"Hi core java",StandardOpenOption.APPEND);
			String data = Files.readString(Path.of(path)); //inbuild function to check path
			System.out.println(data);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

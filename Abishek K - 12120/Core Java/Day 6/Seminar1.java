package com.day6;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
public class Seminar1 {

	public static void main(String[] args) {
		var path = "D:/JAVA/Demo.txt";
		
		try {
			Files.writeString(Path.of(path),"Hi all ",StandardOpenOption.APPEND);
			String data = Files.readString(Path.of(path));
			System.out.println(data);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

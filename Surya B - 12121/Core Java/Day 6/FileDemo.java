package com.coreDay6;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {

	public static void main(String[] args) {
		
		var path = "D:\\FileHandling\\prem.txt";
		try {
			Files.writeString(Path.of(path),
					"Prasanth is a Coder", StandardOpenOption.APPEND);
			String data = Files.readString(Path.of(path));
			System.out.println(data);
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package com.day7;
import java.nio.file.Files;
import java.nio.file.Path;



public class PathFile {

	public static void main(String[] args) {
		var path="D:\\Core_Java\\sql.txt";
		try{
			String data=Files.readString(Path.of(path)); // readString method is used to read the string from the file
			System.out.println(data);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}

}

package com.day6adv;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ReadAndWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var path ="D://h.txt";
		try
		{
		Files.writeString(Path.of(path),"hem", StandardOpenOption.APPEND);
		String data = Files.readString(Path.of(path));
		System.out.println(data);
		}
		catch(Exception e)
		{

		e.printStackTrace();

	}

}
}

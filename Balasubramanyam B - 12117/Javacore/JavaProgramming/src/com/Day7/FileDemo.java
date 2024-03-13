package com.Day7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {
    public static void main(String args[]) {
        var path = "D:\\JavaProgramming\\notes.txt";
        try {
        	//Files.writeString(Path.of(path)," Hello Dhamu",StandardOpenOption.APPEND);
            String data = Files.readString(Path.of(path));
            System.out.println(data);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

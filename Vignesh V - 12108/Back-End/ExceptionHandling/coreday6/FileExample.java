package com.coreday6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class FileExample {
	
		
		public static void main(String[] args) {
	        
	        var path = "D:\\demo.txt";
	        
	        try {
	            Files.writeString(Path.of(path),"\nThis is vignesh" ,StandardOpenOption.APPEND);
	            String data = Files.readString(Path.of(path));
	            System.out.println(data);
	        } catch (IOException e) {
	            System.out.println(e);
	        }
	        

	    }

	}

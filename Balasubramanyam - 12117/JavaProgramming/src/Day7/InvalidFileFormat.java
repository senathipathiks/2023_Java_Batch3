package com.Day7;

import java.util.Arrays;
import java.util.Scanner;

class FileFormatException extends Exception {

	@Override
	public String getMessage() {

		return "The given file format is not valid";
	}

}

public class InvalidFileFormat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name with extension only pdf*");
		String name = sc.next();

		String[] ext = name.split("\\.");

		if (ext[1] != "pdf") {
			try {
				throw new FileFormatException();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

}

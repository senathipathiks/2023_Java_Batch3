package com.coreday6;

class InvalidFileFormat extends Exception {
	InvalidFileFormat(String msg) {
		super(msg);
	}
}

class ValidFile {

	ValidFile(String fileName) throws InvalidFileFormat {
		String[] str = fileName.split("\\.");
		if (!str[1].equals("pdf") || !str[1].equals("docx"))
			System.out.println("File in Processing");
		else
			throw new InvalidFileFormat("Invalid File Format : Please provide only Pdf and docx");

	}
}

public class CustomExceptionExample3 {

	public static void main(String[] args) {

		try {
			@SuppressWarnings("unused")
			ValidFile file = new ValidFile("Java8.txt");
		} catch (InvalidFileFormat e) {
			System.out.println(e.getMessage());
		}

	}
}

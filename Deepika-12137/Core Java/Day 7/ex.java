package com.day7;

class InvalidFileFormats extends Exception{
	
	InvalidFileFormats(String frmt) {
		super(frmt);
	}
}

class FileFormats {
	FileFormats(String formats) throws InvalidFileFormats{
		if(formats.endsWith(".pdf")) {
			throw new InvalidFileFormats("Document accepted");
	}
		else {
			System.out.println("This file format is not accepted..");
		}
		
}

public class ex {

	public static void main(String[] args) {

				try {
					
				FileFormats obj=new FileFormats(".jpg");
			}
				catch (InvalidFileFormats e) {
					System.out.println(e.getMessage());
				}
		}

	}

}

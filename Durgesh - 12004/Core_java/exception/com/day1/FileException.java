package com.day1;

class InvalidFile extends Exception {
	InvalidFile(String msg){
		super(msg);
	}
}

class Result {
	Result(String filename) throws InvalidFile {
		if(!filename.endsWith(".txt") && !filename.endsWith(".pdf") )
			throw new InvalidFile("The Given file is not in the format");
		
		else
			System.out.println("The given file is in format");
	}
}
public class FileException {
	
	public static void main(String[] args) {
		try {
			Result r = new Result("f2.pdf");
		}
		catch (InvalidFile e) {
			System.out.println(e.getMessage());
		}
	}

}

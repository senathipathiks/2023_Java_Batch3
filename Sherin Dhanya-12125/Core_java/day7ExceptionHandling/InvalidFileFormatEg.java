package com.day7ExceptionHandling;
class InvalidFileFormatException extends Exception{
	InvalidFileFormatException(String msg){
		super(msg);
	}
}
class FileFormat{
	FileFormat(String Format) throws InvalidFileFormatException{
		String[]str=Format.split("\\.");
	
	if(str[1].equals("pdf") || str[1].equals("jpg")) {
		throw new InvalidFileFormatException("The file format is correct");
	}
	else {
		System.out.println("The format is incorrect Enter the correct format");
	}
}
}
public class InvalidFileFormatEg {

	public static void main(String[] args) {
try {
	FileFormat obj=new FileFormat("sherin.docx");
}
catch(InvalidFileFormatException e) {
	System.out.println(e.getMessage());
}
	}

}

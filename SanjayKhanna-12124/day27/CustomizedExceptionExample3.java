package com.day27;

@SuppressWarnings("serial")
class InvalidFileFormat extends Exception{
	
	public InvalidFileFormat(String msg) {
		super(msg);
	}
}

class FileFormat {
	public FileFormat(String fileName) throws InvalidFileFormat {
		String[] str = fileName.split("\\.");
	 if(str[1].equals("pdf")||str[1].equals("docx"))
		 System.out.println("File in Processing");
	 else
		 throw new InvalidFileFormat("Invalid File Format : Please provide only Pdf and docx");
		
	}
}
public class CustomizedExceptionExample3 {

	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unused")
			FileFormat file = new FileFormat("Java8.txt");
		}catch(InvalidFileFormat e) {
			System.out.println(e.getMessage());
		}

	}

}

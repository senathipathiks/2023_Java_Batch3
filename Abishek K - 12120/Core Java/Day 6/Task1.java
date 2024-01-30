//InvalidFileFormat     
//InvalidPasswordFormat 
//InvalidMonthException
//InvalidDateFormat

package com.day6;

class InvalidFileFormat extends Exception{
	
	InvalidFileFormat(String msg){
		super(msg);
	}
}

class File {
	void Fformat() throws InvalidFileFormat{
		
		String in = "file.pdf";
		//String check = "pdf";
		
		//System.out.println(check1[0]);
		//String test = check1[1];
		
		String[] str=in.split("\\.");
		System.out.println(str[0]);
		if(in.endsWith(".pdf")){
			System.out.println("Uploaded File in Correct Format onlly");
		}
		else {
			throw new InvalidFileFormat("Uploaded File Format is not Accepted");
		}
	}
}

public class Task1 {

	public static void main(String[] args) {
		try {
		File obj = new File();
		obj.Fformat();
		}
		catch(InvalidFileFormat ex) {
			System.out.println(ex.getMessage());
		}

	}

}

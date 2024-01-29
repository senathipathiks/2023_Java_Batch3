package com.day7;

class InvalidFileFormetException extends Exception{
	
	
	public InvalidFileFormetException(String msg) {
		super(msg);
	}
	
	
	
}

class Filecheck{
	
	void Check(String s) throws InvalidFileFormetException{
		
		   String [] str = s.split("\\.");
		   
		  //int flag=0;
		   
//		   for (String s1 : str) {
//			   
//			   if(s1=="pdf") {
//				   System.out.println("The file Format is correct");
//				   flag++;
//			   }

		  
		   //System.out.println(str[1]);
		   
		  if(str[1].equals("pdf")) {
			  System.out.println("The file Format is correct");
			  
		  }
		  else {
			  
			  try {
				  throw new InvalidFileFormetException("Upload the current formet");
			  }
			  catch(InvalidFileFormetException e) {
				  
				  System.out.println(e.getMessage());
			  }
			  
		  }
			  
			   
			  
			} 
			
		}
		   
		  
		
	
	




public class FileFormetEx {

	public static void main(String[] args) throws InvalidFileFormetException {
		
		 Filecheck f = new  Filecheck();
		 
		 f.Check("prasanth.pdf");
		

	}

}

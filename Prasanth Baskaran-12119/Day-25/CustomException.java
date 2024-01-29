package com.day7;

class InvalidNo extends Exception{
	
	InvalidNo(String msg){
		
		super(msg);
	}
	
}



public class CustomException {

	public static void main(String[] args) throws InvalidNo {
		
        int num = 110;
        
        
        try {
			if (num > 100) {

				throw new InvalidNo("Number is Invalid , Please enter the Correct No be !!!");
			} 
		} catch (InvalidNo e) {
			
			System.out.println(e.getMessage());
		}
        
        System.out.println("Custom Generated Exception");
        
      
	}

}

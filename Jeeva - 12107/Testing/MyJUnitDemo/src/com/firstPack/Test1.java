package com.firstPack;



public class Test1 extends RuntimeException {


	// Check Wether the number is increasing or not
	
	public int findIncreasing(int input)
	{
		String s=Integer.toString(input);
		
		int num1=Integer.parseInt(Character.toString(s.charAt(s.length()-2)));
		int num2=Integer.parseInt(Character.toString(s.charAt(s.length()-1)));
		
		if((num2)-1==num1) {
			return 1;
		}else {
			return 0;
		}		
			
		}
	
	
	
	
	

	public String checkTheAge(int age) throws MinorAgeException, InvalidAgeException {
		
		if(age>18) {
			 return "Eligible";			    
		}
		else if(age<=10&&age>0) {
			 throw new MinorAgeException("Minor Age Exception");
		}
		else if(age==(-18)) {
			throw new InvalidAgeException("Negative Age");
		}		
		else {
			return "Not Eligible";	
		}
		
		
		
	}
	


}

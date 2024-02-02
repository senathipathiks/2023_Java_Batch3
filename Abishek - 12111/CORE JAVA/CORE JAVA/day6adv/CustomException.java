package com.day6adv;
class InvalidNo extends Exception
{
	InvalidNo(String msg)
	{
		super(msg);
		
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 110;
		try 
		{
			if(n1>100)
			
				throw new InvalidNo("Number is invalid : Provide the valid number between 1 to 100");
		}
			catch(InvalidNo e)
			{
			 System.out.println(e.getMessage());	
			}
		
		System.out.println("Custom generated Exeception");
	}
	
}



package com.day6adv;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		super(msg);
		
	}
	
}
class ElectionCommision
{
	ElectionCommision(int age) throws InvalidAgeException
	{
		if(age<18 || age>110)
		{
			throw new InvalidAgeException("not eligible to vote");
		}
		else
		{
			System.out.println("welcome to election commision of India");
		}
	}
}
public class CustomException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ElectionCommision obj = new ElectionCommision(13);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}

package com.junit.task2;

public class Voter {
	
	String checkAge(int age) throws MinorAgeException, NegativeAgeException
	{
		 if(age>=18) {
			 return "Eligible";
		 }else if (age>=16 && age<18) {
			 return "Not Eligible";
			 } else if (age<=10 && age>=1) {
				 throw new MinorAgeException("Minor Age");
				 }else if (age <=1) {
					throw new NegativeAgeException("Invalid Age");
				}
		 
				return null;
	}

}

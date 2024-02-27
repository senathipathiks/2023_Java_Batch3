package com.day5.core;

public class EceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Class temp=Class.forName("com.day1.core.Bank");
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

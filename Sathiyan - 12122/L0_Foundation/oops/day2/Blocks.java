package com.oops.day2;

public class Blocks {
	
	{
		System.out.println("I'm a Non-static block");
	}

	static {
		System.out.println("I'm a Static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main methods");
		
		@SuppressWarnings("unused")
		Blocks block=new Blocks();
		

	}

}

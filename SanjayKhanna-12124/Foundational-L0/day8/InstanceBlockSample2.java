package com.day8;

public class InstanceBlockSample2 {
	
	{
		System.out.println("Instance Block 1");
		{
			System.out.println("Nested Instance Block ");
		}
	}
	{
		System.out.println("Instance Block 2");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		InstanceBlockSample2 obj = new InstanceBlockSample2();
	}

}

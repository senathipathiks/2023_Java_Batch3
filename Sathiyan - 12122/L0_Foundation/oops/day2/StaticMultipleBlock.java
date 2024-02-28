package com.oops.day2;

public class StaticMultipleBlock {

	static{
		System.out.println("IB1");
		{
			System.out.println("Nested IB1");
		}
	}
	
	static {
		System.out.println("IB2");
	}

	public static void main(String[] args) {

	}

}

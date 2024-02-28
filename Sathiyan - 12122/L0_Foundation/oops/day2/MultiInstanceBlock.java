package com.oops.day2;

public class MultiInstanceBlock {
	
	{
		System.out.println("IB1");
		{
			System.out.println("Nested IB1");
			{
				System.out.println("Nested inside another nested block");
			}
		}
	}
	
	{
		System.out.println("IB2");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiInstanceBlock obj=new MultiInstanceBlock();

	}

}

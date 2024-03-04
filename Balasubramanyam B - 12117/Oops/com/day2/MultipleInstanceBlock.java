package com.day2;

public class MultipleInstanceBlock {
	{
		System.out.println("instance block");
		{
			System.out.println("nested block");
		}
	}
	{
		System.err.println("instance block1");
	}
	public static void main(String[] args) {
		MultipleInstanceBlock hh = new MultipleInstanceBlock();

	}

}

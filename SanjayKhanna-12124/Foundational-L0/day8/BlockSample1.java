package com.day8;

public class BlockSample1 {
	public BlockSample1() {
		System.out.println("This is Constructor");
	}
	
	{
		System.out.println("Instance Block Executed!!!");
	}
	
	static {
		System.out.println("Static Block Executed!!!");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BlockSample1 obj = new BlockSample1();
		System.out.println("This is Main Method");
	}

}

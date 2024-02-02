package com.day8;

public class BlockSample2 {
	public BlockSample2() {
		this(10);
		System.out.println("This is Default Construtor");
	}
	public BlockSample2(int arg){
		System.out.println("This is a Parameterised Constructor "+arg);	
	}
	{
		System.out.println("Instance Block Executed!!!");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		BlockSample2 obj = new BlockSample2();
	}

}

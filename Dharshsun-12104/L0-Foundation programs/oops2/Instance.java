package com.oops2;

public class Instance {
	static{
		System.out.println("instance block1");
	{
			System.out.println("nested block2");
		}
	}
	static{
	System.out.println("instance block 2");

}
	public static void main(String[] args) {
		Instance obj1 = new Instance();
	}
}

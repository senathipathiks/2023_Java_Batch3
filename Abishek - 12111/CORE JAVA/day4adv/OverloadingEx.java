package com.day4adv;

public class OverloadingEx {
	public static void area()
	{
		System.out.println(3.14*7*7);
	}
	public static void area(int side)
	{
		System.out.println(side*side);
	}
	public static void area(int l,int b)
	{
		System.out.println(l*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area();
		area(4);
		area(4,3);
	}

}

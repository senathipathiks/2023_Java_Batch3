package com.day2;

public class Blocks {
	int a,b,c;
	{
		a=10;
	}
	Blocks(){
		b=20;
	}
	Blocks(int c){
		this.c=c;
	}
//	Blocks(){
//		System.out.println("Constructor");
//	}
	{
		System.out.println("Instance block");
	}
	{
		System.out.println("Instance block");
	}
	static{
		System.out.println("Static block");
	}
	public static void main(String[] args) {
		System.out.println("hi iam method");
		Blocks block = new Blocks(6);
}}

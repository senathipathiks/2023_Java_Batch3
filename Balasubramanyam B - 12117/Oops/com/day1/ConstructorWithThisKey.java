package com.day1;

public class ConstructorWithThisKey {
	ConstructorWithThisKey(){
		this(5);
		System.out.println("C");
	}
	ConstructorWithThisKey(int a){
		this("hi");
		System.out.println("A");
	}
	ConstructorWithThisKey(String b){
		System.out.println("B");
	}
	public static void main(String[] args) {
		ConstructorWithThisKey c=new ConstructorWithThisKey();

	}

}

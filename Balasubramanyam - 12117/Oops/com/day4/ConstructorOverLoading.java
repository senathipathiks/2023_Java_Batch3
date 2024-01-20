package com.day4;

public class ConstructorOverLoading {
	ConstructorOverLoading(int a,int b){
		System.out.println(a+b);
	}
	ConstructorOverLoading(boolean a,boolean b){
		System.out.println(a+" "+b);
	}
	ConstructorOverLoading(float a , float b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ConstructorOverLoading c = new ConstructorOverLoading(10,20);
		ConstructorOverLoading c1 = new ConstructorOverLoading(10,20);
		ConstructorOverLoading c2 = new ConstructorOverLoading(10.0f,20.0f);

	}

}

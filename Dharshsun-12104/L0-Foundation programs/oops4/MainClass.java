package com.oops4;

class Vehicle2{
	int a = 10;
	void myMethod() {
		System.out.println("A");
	}
}
class TwoWheeler2 extends Vehicle2{
	int a =20;
	void myMethod() {
		System.out.println("B");
	}
}
public class MainClass {
	public static void main(String args[]) {
		Vehicle2 bike = new TwoWheeler2();//DMD 
		//sub class can be assigned to super class.(no reverse inheritance of parent inheriting child is possible.
		System.out.println(bike.a);//10
		bike.myMethod();//B
	}

}

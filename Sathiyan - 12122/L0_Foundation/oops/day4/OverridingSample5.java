package com.oops.day4;


class Vehicle2{
	int a=10;
	void myMethod() {
		System.out.println("I'm A superclass method");
	}
}

class TwoWheeler2 extends Vehicle2{
	int a=20;
	void myMethod() {
		System.out.println("I'm a sub-class method");
	}
}

public class OverridingSample5 {

	public static void main(String[] args) {
		Vehicle2 ref=new TwoWheeler2();//(By DMD Overriding based on Objects).
		System.out.println(ref.a);//Variable cannot be Overrided...
		ref.myMethod();//It calls Sub-class method...
	}

}

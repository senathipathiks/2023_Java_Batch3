package com.oops4;
//overriding is based on object
//non overriding is based on reference
//constructor,final,private,static cannot be overriden
class Vehicle1{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
	void noOfWheels() {
		System.out.println("Depends on the vehicle");
	}
}

class TwoWheeler1 extends Vehicle1{
	void noOfWheels(){
		super.noOfWheels();
		System.out.println("I have two wheels");
	}
}


public class DynamicMethodDispatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Vehicle1 bike = new TwoWheeler1();//Dynamic method dispatch
           bike.noOfEngine();
           bike.noOfWheels();
	}

}

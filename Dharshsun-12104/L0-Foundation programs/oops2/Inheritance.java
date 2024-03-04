package com.oops2;

class TwoWheeler{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bike extends TwoWheeler{ // single inheritance.
	void brandName() {
		System.out.println("My brand name is RE" );
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.noOfWheels();
		bike.brandName();
	}

}

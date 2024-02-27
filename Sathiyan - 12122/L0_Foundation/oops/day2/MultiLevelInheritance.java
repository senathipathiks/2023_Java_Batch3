package com.oops.day2;


class Vehicle{
	void noofEngine() {
		System.out.println("I have one engine");
	}
	
}

class TwoWheelers extends Vehicle{
	
	void noOfWheels(){
		System.out.println("I have 2 wheels");
	}
}

class Bikes extends TwoWheelers{
	void brandName() {
		System.out.println("My brand is YAMAHA");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Bikes obj=new Bikes();
		obj.noofEngine();
		obj.brandName();
		obj.noOfWheels();

	}

}

package com.coreday3;

class Vehicle {
	void display() {
		System.out.println("All Vehicle having an Wheel");
	}
}

class Twowheeler extends Vehicle {
	void display() {
		System.out.println("I having only Two Wheels");
	}
}

class Fourwheeler extends Vehicle {
	void display() {
		System.out.println("I having only Four Wheels");
	}
}

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.display();
		Vehicle obj1 = new Twowheeler();
		obj1.display();
		Vehicle obj2 = new Fourwheeler();
		obj2.display();

	}

}

package com.day2;
// Hierarical Inheritance
class Vehicle1{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class TwoWheelers1 extends Vehicle1 {
	void noOfWheels() {
		System.out.println("I have Two wheels");
	}
}

class FourWheelers extends Vehicle1 {
	void noOfwheels() {
		System.out.println("I have four wheels");
	}
}
public class HieraricalInher {
    public static void main(String[] args) {
    	TwoWheelers w = new TwoWheelers();
    	w.noOfEngine();
    	w.noOfWheels();
    	
    	FourWheelers w1 = new FourWheelers();
    	w1.noOfEngine();
    	w1.noOfwheels();
	}
}

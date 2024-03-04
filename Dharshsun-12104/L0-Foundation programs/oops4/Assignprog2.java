package com.oops4;
// display speed of car and bicycle
class Vehicle12{
	void determineSpeed() {
		System.out.println("Determine speed function");
	}
}

class Car extends Vehicle12{
	void speedUp() {
		System.out.println("The average speed of car is 60km/hr");
	}
}

class Bicycle extends Vehicle12{
	void speedUp() {
		System.out.println("The average speed of cycle is 15-20km/hr");
	}
}



public class Assignprog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vehicle12 speed = new Vehicle12();
        speed.determineSpeed();
        Bicycle speed1 = new Bicycle();
        Car speed2 = new Car();
        speed1.speedUp();
        speed2.speedUp();
        
	}

}

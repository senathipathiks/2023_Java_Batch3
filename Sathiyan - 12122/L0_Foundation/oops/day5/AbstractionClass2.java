package com.oops.day5;

/*
 * Abstract Class constructor
 * Abstract class = Normal class + Abstract Method
 * Abstract class can't be A final class
 * Abstract method can't be a final one
 * Abstract class can't be a Static one.
 * (Reason : Abstract class must be inherit but static and final keywords are implemented in front of the 
 * 	Method or a class means it can't be Inherited so Abstract and Final/Static together is not possible.)
 */


abstract class Vehicles{
	
	Vehicles(){//Default Constructor 
		System.out.println("Constructor");
	}
	
	Vehicles(int a) {//Parameterized Constructor
		System.out.println("Paramertized Main class Constructor");	
	}
	
	
	
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
		
	
	abstract void noOfWheels();
	
	
}

class Bikes extends Vehicles{
	
	Bikes(){
		System.out.println("Bike class default Constructor");
	}
	
	Bikes(int b){
		super(9);
		System.out.println("Bike class Constructor");
	}
	
	void noOfWheels() {
		System.out.println("I have one Engine");
	}
}

class Car extends Bikes{
	
	Car(){
		super(8);
		System.out.println("Car class Constructor");
	}
}

public class AbstractionClass2 {

	public static void main(String[] args) {
		Vehicles v=new Bikes();//JVM calls Default constructor during the creation of objects
		v.noOfEngine();//Calls the Parent class Method.
		v.noOfWheels();//Calls the sub class method.
		
	}

}

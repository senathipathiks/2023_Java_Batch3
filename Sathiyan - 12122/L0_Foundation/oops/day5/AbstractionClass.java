package com.oops.day5;

/*
 * Abstraction is hiding the implementation part and showing the necessary details to the user.
 * For eg., Calling,sending messages,emails,Turning on process etc.,
 * Real life example is Atm machine.
 * Two ways to acheive abstraction in java
 * 		>>> Abstract class (0 to 100%).
 * 			Based on the requirement we can acheive declaration(50%) and implementation(50%) is also posssible.
 * 			In abstract class we can define and decalre a method.
 * 			In normal class we can't declare a method we can declare a class.
 * 			It is not possible to create a normal method Declaration using abstract keyword only we can declare a method.
 * 			We can create N number of method definition and and N number of Abstract method decleration.
 * 			It is not posssible to create an Object for Abstract class but possible to create a Reference. 
 * 				Abstract class is a partially completed class (or) Incomplete class.
 * 				With the help of inheritance we can complete the pending works in the class.
 * 				It is mandatory to use the abstract method definition that we declare in the parent or Abstract class on the extended class.
 * 				(or) It is Mandatory to override the value in the inherited class...
 * 
 * 		>>> Interface (Acheive 100% abstraction).
 * 			In interface we can do only Decleration.
 * 
 */

abstract class Vehicle{
	
	void noOfEngines() {//Method Definition
		System.out.println("Every vehicle having Engine");
	}
	
	abstract void noOfWheels();//Method decleartion
	abstract void brandName();//Method Decleration
	
}

abstract class TwoWheeler extends Vehicle{ //In abstract class we can override based on the requirement.
	
	void noOfWheels() {
		System.out.println("I have Four Wheels");
	}
	
}

class Bike extends TwoWheeler{
	
	
	void brandName() {
		System.out.println("My Brand is JAVA");
	}
	
}


public class AbstractionClass {

	public static void main(String[] args) {
		Vehicle v=new Bike();
		v.noOfEngines();//Calls from super class
		v.noOfWheels();//Calls from 1st sub class
		v.brandName();//Calls from 2nd sub class

	}

}

package com.oops.day5;

/*
 * Interface is full of Decleration only.
 * By default Interface all the methods are Abstracted and public so it is not necessary to declare to abstract keyword.
 * Reduce the vsisibilty is not possible while using the method declared in Interface it is necessary to use public keyword.
 * by using extends keyword JVM looking for a constructor but in interface there is no Construtor so we are using Implements Keyword.
 * We can declare method as well as Variable also.
 * 
 */


interface VehiclePlan{
	void noOfEngine();
	void noOfWheels();
	void brandName();
	
}

abstract class Vehicless implements VehiclePlan{
	Vehicless(){
		System.out.println("Default Constructor");
	}
	
	public void noOfEngine() {//Reducing the visibilty so use public keyword to overcome the error.
		System.out.println("I have one engine");
	}
}

abstract class TwoWheelerss extends Vehicless{
	public TwoWheelerss() {
		System.out.println("TwoWheeler class Constructor");
		
	}
	
	public void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bikess extends TwoWheelerss{
	
	public Bikess() {
		System.out.println("Bike class Constructor");
	}
	
	public void brandName() {
		System.out.println("My name is Honda");
		
	}
}

public class InterfaceExamples {

	public static void main(String[] args) {
		
		Vehicless v=new Bikess();
		v.noOfEngine();
		v.noOfWheels();
		v.brandName();

	}

}

package com.day10;

class Animal{
	static void sound() {
		System.out.println("Animal have their own sound");
	}
}

class Lion extends Animal{
	static void sound() {
		System.out.println("Lion will Roar...");
	}
}

public class MethodOverridingDmdSample2 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Animal obj = new Lion();
		obj.sound();
		
		Lion obj1 = new Lion();
		obj1.sound();
		
	}

}

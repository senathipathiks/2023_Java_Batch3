package com.day10;

class Animals{
	void sound() {
		System.out.println("Animal have their own sound");
	}
}

class Peacock extends Animals{
	void sound() {
		System.out.println("Ceewwooo.....");
	}
}

class Cat extends Animals{
	void sound() {
		System.out.println("Meewwooo.....");
	}
	
}

public class MainClass1 {

	public static void main(String[] args) {
		Animals peacock = new Peacock();
		peacock.sound();
		Animals cat = new Cat();
		cat.sound();

	}

}

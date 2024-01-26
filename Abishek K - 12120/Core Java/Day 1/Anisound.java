package com.day1;

class Animal{
	void sound() {
		System.out.println("Animal are Making Sounds");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dogs are Barking");
	}
}
class Cow extends Animal{
	void sound() {
		System.out.println("Cow are Maa...Maaa");
	}
}
class Lion extends Animal{
	void sound() {
		System.out.println("Lions are Roaring...Roaring");
	}
}

public class Anisound {

	public static void main(String[] args) {
		Animal obj = new Cow();
		obj.sound();

	}

}

package com.day1.core;

class Animal{
	void sound() {
		System.out.println("Every Animal Makes different sound");
	}
}

class Dog extends Animal{
	void sound(){
		System.out.println("Dogs sounds Bow-Bow");
	}
}

class Cow extends Animal{
	void sound(){
		System.out.println("Cow sounds Maaaaaaaa");
	}
}

class Lion extends Animal{
	void sound(){
		System.out.println("Lion sounds Roars");
	}
}


public class AnimalDriver {

	public static void main(String[] args) {
		Animal aref=new Animal();
		Dog dref=new Dog();
		Cow cref=new Cow();
		Lion lref=new Lion();
		aref.sound();
		dref.sound();
		cref.sound();
		lref.sound();
	}
}

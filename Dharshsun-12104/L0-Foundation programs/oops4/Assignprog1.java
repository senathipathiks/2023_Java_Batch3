package com.oops4;
//inheritance for animal,bird,cat.
class Animal{
	void Breed() {
		System.out.println("Parent class");
	}
}

class Bird extends Animal{
	void Sound() {
		System.out.println("Chirp Chirp" );
	}
}

class Cat extends Animal{
	void Sound() {
		System.out.println("Meow meow");
	}
}

public class Assignprog1 {
	public static void main(String[] args) {
		Cat species = new Cat();
		Bird species1 = new Bird();
		species.Breed();
		species.Sound();
		species1.Sound();
	}

}

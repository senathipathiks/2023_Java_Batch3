package com.oops.day4;

class Animal{
	void sound() {
		System.out.println("All animals are giving the Sounds");
	}
}

class Bird extends Animal{
	void sound() {
		System.out.println("Parrot can sing like : Ki kiii");
	}
	
}

class Cat extends Animal{
	void sound() {
		System.out.println("Cat sounds like :Meow--....");
	}
}

public class InheritanceAnimals {

	public static void main(String[] args) {
		Cat ref=new Cat();
		Bird ref2=new Bird();
		ref2.sound();
		ref.sound();

	}

}

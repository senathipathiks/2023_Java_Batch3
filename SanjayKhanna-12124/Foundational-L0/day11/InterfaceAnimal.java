package com.day11;

interface Animal2 {												//interface declaration
	void bark();
}

class Dog implements Animal2{
	public void bark() {
		System.out.println("Dog is Barking");					//method overriding
	}
}
public class InterfaceAnimal {

	public static void main(String[] args) {
		Animal2 dog = new Dog();
		dog.bark();

	}

}

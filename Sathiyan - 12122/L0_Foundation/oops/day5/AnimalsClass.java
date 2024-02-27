package com.oops.day5;

interface Animalsss{
	void bark();
}

class Dog implements Animalsss{
	public void bark() {
		System.out.println("Dog is Barking");
	}
}

public class AnimalsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.bark();

	}

}

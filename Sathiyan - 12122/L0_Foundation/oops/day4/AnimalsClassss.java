package com.oops.day4;

interface Animals{
	void bark();
}

class Dog implements Animals{
	public void bark() {
		System.out.println("Dog is Barking");
	}
}

public class AnimalsClassss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.bark();

	}

}

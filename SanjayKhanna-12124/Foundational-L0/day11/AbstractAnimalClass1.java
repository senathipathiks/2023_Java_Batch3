package com.day11;

abstract class Animal{
	abstract void sound();
}

class Lion extends Animal{
	void sound() {
		System.out.println("Roaring....");
	}
}

class Tiger extends Animal{
	void sound() {
		System.out.println("Roaring....");
	}
}

public class AbstractAnimalClass1 {

	public static void main(String[] args) {
		Animal lion = new Lion();
		lion.sound();
		
		Animal tiger = new Tiger();
		tiger.sound();
	}

}

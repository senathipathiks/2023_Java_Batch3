package com.Oops;
class animals{
	void makeSound() {
		System.out.println("Animals!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
class Dog extends animals{
	void makeSound(){
		System.out.println("Bow Bow Bow!!!!!!!!!");
	}
}
class Cow extends animals{
	void makeSound() {
		System.out.println("AMbha AMbha AMbha!!!!!!!!!");
	}
}
class Lion extends animals{
	void makeSound() {
		System.out.println("Lion sound!!!!!!!!!!!");
	}
}
public class Animal {
	public static void main(String[] args) {
		animals a = new animals();
		a.makeSound();
		Dog a1 = new Dog();
		a1.makeSound();
		Cow a2 = new Cow();
		a2.makeSound();
		Lion a3 = new Lion();
		a3.makeSound();

	}

}

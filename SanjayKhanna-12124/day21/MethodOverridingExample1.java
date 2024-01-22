package com.day21;

class Animal {
	void makeSound() {
		System.out.println("Every Animal has their own Sound");
	}
}

class Dog extends Animal{
	public Dog() {
		System.out.println("This is Dog Class");
	}
	void makeSound() {
		System.out.println("Whowowwww...!");
	}
}

class Cow extends Animal{
	public Cow() {
		System.out.println("This is Cow Class");
	}
	void makeSound() {
		System.out.println("Meoooow...!");
	}
}

class Lion extends Animal{
	public Lion() {
		System.out.println("This is Lion Class");
	}
	void makeSound() {
		System.out.println("Roarrrr...!");
	}
}
public class MethodOverridingExample1 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.makeSound();
		Animal cow = new Cow();
		cow.makeSound();
		Animal lion =  new Lion();
		lion.makeSound();

	}

}

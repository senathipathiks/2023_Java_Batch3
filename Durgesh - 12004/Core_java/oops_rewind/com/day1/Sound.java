package com.day1;


abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {
	void sound() {
		System.out.println("Bow Wow");
	}
}
class Cow extends Animal {
	void sound() {
		System.out.println("Maaaa");
	}
}
class Lion extends Animal {
	void sound() {
		System.out.println("Roar");
	}
}

public class Sound {
	

	public static void main(String[] args) {
		Animal d1 = new Dog();
		Animal c1 = new Cow();
		Animal l1 = new Lion();
		
		d1.sound();
		c1.sound();
		l1.sound();
		
	}

}

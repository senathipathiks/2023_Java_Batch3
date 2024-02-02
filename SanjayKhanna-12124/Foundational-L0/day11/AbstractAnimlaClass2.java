package com.day11;

abstract class Animals{
	abstract void eat();
	abstract void sleep();
}

class Lion1 extends Animals{
	void eat() {
		System.out.println("Lion is a Non-vegetrian");
	}
	
	void sleep() {
		System.out.println("Lion sleeps at both Day and Night");
	}
}

class Tiger1 extends Animals{
	void eat() {
		System.out.println("Tiger is a Non-vegetrian");
	}
	
	void sleep() {
		System.out.println("Tiger sleeps at both Day and Night");
	}
}

class Deer extends Animals{
	void eat() {
		System.out.println("Deer is a Vegetrian");
	}
	
	void sleep() {
		System.out.println("Deer sleeps at Night");
	}
}

public class AbstractAnimlaClass2 {

	public static void main(String[] args) {
		Animals lion = new Lion1();
		lion.eat();
		lion.sleep();
		System.out.println("--------------------------------------");
		Animals tiger = new Tiger1();
		tiger.eat();
		tiger.sleep();
		System.out.println("--------------------------------------");
		Animals deer = new Deer();
		deer.eat();
		deer.sleep();
		System.out.println("--------------------------------------");

	}

}

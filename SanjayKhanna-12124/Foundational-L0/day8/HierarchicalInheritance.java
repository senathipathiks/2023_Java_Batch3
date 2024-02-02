package com.day8;

//Hierarchical Inheritance

class Fruit{
	
	void displayFruit() {
		System.out.println("This Object belongs to Fruit class");
	}
}

class Apple extends Fruit{
	void displayApple() {
		displayFruit();
		System.out.println("Fruit Name : Apple");
	}
}
class Mango extends Fruit{
	void displayMango() {
		displayFruit();
		System.out.println("Fruit Name : Mango");
	}
}
class Orange extends Fruit{
	void displayOrange() {
		displayFruit();
		System.out.println("Fruit Name : Orange");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Apple ap = new Apple();
		ap.displayApple();
		
		Mango ma = new Mango();
		ma.displayMango();
		
		Orange or = new Orange();
		or.displayOrange();
		
		
		

	}

}

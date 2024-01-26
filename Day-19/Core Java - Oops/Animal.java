package com.newclass;


class Dog{
	
	void makeSound(){
		System.out.println("Dog Sounds like a  Bow Bow!!!");
	}
	
}
class Cow extends Dog {
	
	
	void makeSound(){
		System.out.println("Cow Sounds like a  Mhaaaaa!!!");
	}
	
}

class Lion extends Cow{
	
	void makeSound(){
		System.out.println("Lion Sounds like a  Roar!!!");
	}
}

public class Animal {

	public static void main(String[] args) {
		
		Cow obj = new Lion();
		obj.makeSound();
		

	}
                              
}

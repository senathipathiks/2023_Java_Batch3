package com.oops.day5;

abstract class Animals{
	abstract void sound();
}

class Lion extends Animals {
	void sound() {
		System.out.println("Lion Roars");
	}
}

class Tiger extends Animals{
	void sound() {
		System.out.println("Tiger also Roars");
	}
}

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a=new Lion();
		a.sound();
		
		Animals b=new Tiger();
		b.sound();
	}

}

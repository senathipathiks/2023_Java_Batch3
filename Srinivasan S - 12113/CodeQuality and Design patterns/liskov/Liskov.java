package com.code.liskov;

class Animal {

	void makeNoise(String noise) {
		System.out.println(noise);
	}

	void livesIn(String lives) {
		System.out.println(lives);
	}

}

class Tiger extends Animal {

}

class Lion extends Animal {

}

public class Liskov {

	public static void main(String[] args) {

		// Tiger tiger=(Tiger) new Animal(); it will throw class cast exception

		// we cannot create child type of reference to parent
		// because animal cannot cast to tiger means parent cannot cast to child

		Animal tiger = new Tiger();
		tiger.livesIn("Jungle");
		tiger.makeNoise("Roar");

		Lion lion = new Lion();
		lion.livesIn("Jungle");
		lion.makeNoise("Roar-Roar");
	}
}
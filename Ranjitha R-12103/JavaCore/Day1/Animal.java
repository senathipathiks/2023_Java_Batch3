//Create an animal class as base class and create the subclasses named Dog, Cow, Lion. 
//override the makeSound method in the subclasses.

package Day1;

class Animals {
	void sound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animals {
	void sound() {
		System.out.println("Dog sound");
	}
}

class Cow extends Animals {
	void sound() {
		System.out.println("Cow sound");
	}
}

class Lion extends Animals {
	void sound() {
		System.out.println("Lion sound");
	}
}

public class Animal {
	public static void main(String args[]) {
		Animals a1 = new Animals();
		a1.sound();
		Dog d1 = new Dog();
		d1.sound();
		Cow c1 = new Cow();
		c1.sound();
		Lion l1 = new Lion();
		l1.sound();
	}
}
package classIntro;
//Create an animal class as base class and create the subclasses named Dog, Cow, Lion. 

//override the makeSound method in the subclasses

public class Animal {
	public void makeSound() {
		System.out.println("Animals sound");
	}

	public static void main(String[] args) {

		Animal d = new Animal();
		d.makeSound();
		Dog a = new Dog();
		a.makeSound();
		Cow c = new Cow();
		c.makeSound();
		Lion a1 = new Lion();
		a1.makeSound();

	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("Dog barking....");
	}
}

class Cow extends Animal {
	public void makeSound() {
		System.out.println("Cow boow boow....");
	}
}

class Lion extends Animal {
	public void makeSound() {
		System.out.println("Lion sounds ....");
	}

}

package Day_1;
/*Create an animal class as base class and create the subclasses named Dog, Cow, Lion. 
override the makeSound method in the subclasses.
 * */

class Animal{
	void makeSound() {
		System.out.println("Animal will make different types of sound");
	}
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog will bark as bow-bow");
	}
}

class Cow extends Animal{
	void makeSound() {
		System.out.println("Cow will make sound as moo-moo");
	}
}

class Lion extends Animal{
	void makeSound() {
		System.out.println("Lion will roar as hurr-hurrr");
	}
}

public class AnimalSound {

	public static void main(String[] args) {
		Animal a=new Animal();
		Animal d=new Dog();
		Animal c=new Cow();
		Lion l=new Lion();
		a.makeSound();
		d.makeSound();
		c.makeSound();
		l.makeSound();
	}

}

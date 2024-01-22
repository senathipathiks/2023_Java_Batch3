package day1_assignment;

class Animal{
	public void makeSound() {
		System.out.println("Sound from animal class");
	}
}

class Lion extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Lion Roars");
	}
	
}

class Dog extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Dog Barks");
	}
	
}

class Cow extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Cow Maeh");
	}
	
}

public class AnimalDriver {
	
	public static void main(String[] args) {
		
		Animal lion = new Lion();
		Animal cow  = new Cow();
		Animal dog =  new Dog();
		
		lion.makeSound();
		dog.makeSound();
		cow.makeSound();
	
	}

}

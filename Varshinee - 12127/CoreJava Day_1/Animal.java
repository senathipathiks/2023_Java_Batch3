//Create an animal class as base class and create the subclasses named Dog, Cow, Lion. 
//override the makeSound method in the subclasses.
package Day_1;

abstract class Animals {
	abstract void makeSound() ;
}
	class Dog extends Animals{
		void makeSound() {
			System.out.println("Woof!");
		}
	}
	class Cow extends Animals{
		void makeSound() {
				System.out.println("Maaaaa!");
		}
	}
	class Lion extends Animals{
		void makeSound() {
			System.out.println("Roar");
		}
	}

public class Animal{ 
	
public static void main(String[] args) {
		Animals obj =new Dog();
		obj.makeSound();
		
		Animals obj1=new Cow();
		obj1.makeSound();
		
		Animals obj2=new Lion();
		obj2.makeSound();
		
	}

	}



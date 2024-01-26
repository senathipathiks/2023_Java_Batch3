package Com.Day1;

/*Create an animal class as base class and create the subclasses named Dog, Cow, Lion. 
override the makeSound method in the subclasses.*/


class Animalsound{
	void makesound() {
		System.out.println("Animal will make various sounds");
	}
}
class dog extends Animalsound{
		void makesound() {
			System.out.println("Dog barks..");
		}
		}
	class cow extends Animalsound{
		void makesound() {
			System.out.println("Cow Moo..");
		}
	}
	class Lion extends Animalsound{
		void makesound() {
			System.out.println("Lion roars..");
		}
	}
	
public class Animal {
	public static void main(String[] args) {
		Animalsound obj1=new Animalsound();
		Lion obj2=new Lion();
		dog obj3=new dog();
		cow obj4=new cow();

		obj1.makesound();
		obj2.makesound();
		obj3.makesound();
		obj4.makesound();
		

	}
}

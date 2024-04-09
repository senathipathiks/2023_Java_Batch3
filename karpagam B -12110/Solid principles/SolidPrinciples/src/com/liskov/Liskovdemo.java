package com.liskov;

//liskov substitution principle -- against the inheritance overriding concepts
class Animal{
	void makeNoise(String NoiseType) {
		System.out.println(NoiseType);
	}
	void livesIn(String livingType) {
		System.out.println(livingType);
	}
}
	class Monkey extends Animal{
		
	}
	class Tiger extends Animal{
		
	}


public class Liskovdemo {
	public static void main(String[] args) {
		
		//using the child object we can replace the parent object
		Monkey animal=(Monkey) new Animal(); 
		//class cast exception--Animal cannot be cast to class com.liskov.Monkey
		
		
		animal.livesIn("tree");
		animal.makeNoise("creep");
		
		
//		Animal animal=new Monkey();
//		animal.makeNoise("creep");
//		animal.livesIn("Tree");
//		
		
		

		
	}
	

}

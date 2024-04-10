package Liskov;


class Animal{	
	void makeNoise(String noiseType) {
		System.out.println(noiseType);
	}
	
	void livesIn(String livingType) {
		System.out.println(livingType);
	}
}

class Monkey extends Animal{
	
}
class Tiger extends Animal{
	
}

public class LspDemo {
	public static void main(String[] args) {
		
		Animal a=new Monkey();
		
		Monkey a1=(Monkey) a;
		a.makeNoise("Creep...");
		a.livesIn("Tree");
		
		
		
		
		
	}
	
	
	
}

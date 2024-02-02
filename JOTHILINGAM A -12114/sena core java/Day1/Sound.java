package Day1;

class animal {
	void makeSound() {
		System.out.println("Sound");
	}
}
class dog extends animal{
	@Override
	void makeSound() {
		System.out.println("dog baaaaaaaaaaaaaaaaaaark!!!!!!!");
	}
}
class cow extends animal{
	@Override
	void makeSound() {
		System.out.println("Cow maaaaaa!!!!!!!!!");
	}
	
}
class lion extends animal{
	@Override
	void makeSound() {
		System.out.println("lion roarrrrrrrr!!!!!!!!!");
	}
}

public class Sound {

	public static void main(String[] args) {
		
		lion l=new lion();
		l.makeSound();

	}

}

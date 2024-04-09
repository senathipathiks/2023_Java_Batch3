package lsp;

class Animal{
	void makeNoise(String noiseType) {System.out.println(noiseType);}

	void livesIn(String livingType) {System.out.println(livingType);}
}

class Monkey extends Animal
{
	void makeNoise(String noiseType)
	{System.out.println(noiseType);
	System.out.println("Executed");
	}
}
class Tiger extends Animal
{
	
}

public class LSPDemo {

	public static void main(String[] args) {
		
		Monkey mm=(Monkey) new Animal();
		mm.makeNoise("jajjaj");
		mm.livesIn("Tree");
		
//		Animal mm=new Monkey();
//		mm.livesIn("Tree");
//		mm.makeNoise("creep...");
//		
//		Animal tg=new Tiger();
//		tg.livesIn("Cave");
//		tg.makeNoise("Grr...");
				
	}
}

package lsp;

class Animal
{
	void makeNoise(String noiseType) 
	{
		System.out.println(noiseType);
	}
	void livesIn(String livingType) 
	{
		System.out.println(livingType);
	}
}
class Monkey extends Animal
{
	
}
class Tiger extends Animal
{
	
}

public class LSPDemo 

{
	public static void main(String[] args) 
	{
		
		Monkey mm=(Monkey) new Animal();
		mm.makeNoise("jajajaa");
		mm.livesIn("Tree");
		
		
//		Animal mk=new Monkey();
//		mk.livesIn("Tree");
//		mk.makeNoise("creep.....");
//		
//		Animal tg=new Monkey();
//		tg.livesIn("Cave");
//		tg.makeNoise("Grrr.....");
	}
	

}

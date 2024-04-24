package com.cqp.liskovprinciple;


class Animals{
	void makeNoise(String noiseType) 
	{
		System.out.println(noiseType);
	}
	
	void livesIn(String livingType) 
	{
		System.out.println(livingType);
	}
	
	class Monkey extends Animal
	{
		
	}
	class Tiger extends Animal
	{
		
	}
	public class Animal {
		public static void main(String[] args) {
			
			Monkey mm= (Monkey) new Animal();
			mm.makeNoise("jaja");
			
			Animals am=new Monkey();
			am.livesIn("tree");
			
		}
}
}
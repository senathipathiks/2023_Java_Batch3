package com.day5;
abstract class player{
	abstract void types();
}
class CricketPlayer extends player{
	void types() {
		System.out.println("Cricket player");
	}
}
class VolleyBallPlayer extends player{
	void types() {
		System.out.println("Voll player");
	}
}
class FootballPlayer extends player{
	void types() {
		System.out.println("Football player");
	}
}
public class GamesAbstraction {

	public static void main(String[] args) {
		CricketPlayer obj=new CricketPlayer();
		obj.types();
		
		VolleyBallPlayer obj1=new VolleyBallPlayer();
		obj1.types();
		
		FootballPlayer obj2=new FootballPlayer();
		obj2.types();
		
		

	}

}

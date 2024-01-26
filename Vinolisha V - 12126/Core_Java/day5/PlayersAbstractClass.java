package com.day5;

abstract class Player{
	abstract void Count();
}

class CricketPlayer extends Player{
	void Count() {
		System.out.println("In Cricket maximum of eleven players in one team ");
	}
}

class VollyBallPlayer extends Player{
	void Count() {
		System.out.println("In VollyBall six on each team ");
	}
}
 class  FootBallPlayer extends Player{
	 void Count() {
		 System.out.println("In Football Total number of player is 22");
	 }
 }


public class PlayersAbstractClass {

	public static void main(String[] args) {
		FootBallPlayer obj1=new FootBallPlayer();
			obj1.Count();
			
			VollyBallPlayer obj2=new VollyBallPlayer();
			obj2.Count();
			
			CricketPlayer obj3=new CricketPlayer();
			obj3.Count();
	}

}

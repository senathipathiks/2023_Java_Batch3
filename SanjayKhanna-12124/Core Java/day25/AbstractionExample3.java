package com.day25;

abstract class Player{
	abstract void display();
}

class VolleyBall extends Player{
	@Override
	void display() {
		System.out.println("This is Played by 6 players");
	}
}

class BasketBall extends Player{
	@Override
	void display() {
		System.out.println("This is Played by 5 players");
	}
}

class Rugby extends Player{
@Override
	void display() {
		System.out.println("This is Played by 15 players");
	}
}

public class AbstractionExample3 {

	public static void main(String[] args) {
		
		Player volleyBall = new VolleyBall();
		volleyBall.display();
		
		Player basketBall = new BasketBall();
		basketBall.display();
		
		Player rugger = new Rugby();
		rugger.display();
		
	}

}

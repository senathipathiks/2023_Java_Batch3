package com.oops.day4;

class Sports{
	void play() {
		System.out.println("Every GAme needs A player to play");
	}
}

class FootBall extends Sports{
	void play() {
		System.out.println("Football needs 11 Player to play Full ground match");
	}
	
}

class BasketBall extends Sports{
	void play() {
		System.out.println("BasketBall needs 11 PLayers to play Full ground match");
	}
	
}

class Rugby extends Sports{
	void play() {
		System.out.println("Rugby needs 15 payers to play a match");
	}
	
}
public class SportsClass {

	public static void main(String[] args) {
		FootBall ref=new FootBall();
		BasketBall ref2=new BasketBall();
		Rugby ref3=new Rugby();
		ref.play();
		ref2.play();
		ref3.play();
	}

}

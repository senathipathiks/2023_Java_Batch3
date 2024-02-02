package com.day24;

class CricketPlayer{
	
	void play() {
		System.out.println("All Cricketer will play");
	}
}

class Batsman extends CricketPlayer{
	@Override
	void play() {
		System.out.println("All Batsmen will play");
	}
}

class Bowler extends CricketPlayer{
	@Override
	void play() {
		System.out.println("All Bowlers will play");
	}
}

public class CricketMainClass {

	public static void main(String[] args) {
		CricketPlayer virat = new CricketPlayer();
		virat.play();
		
		CricketPlayer pandya = new CricketPlayer();
		pandya.play();

	}

}

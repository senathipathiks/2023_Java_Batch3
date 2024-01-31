package com.day5;


abstract class Players {
	String playerName;
	int jerseyNo;
	void sportsman(String playerName, int jerseyNo) {
		this.playerName = playerName;
		this.jerseyNo = jerseyNo;
	}	
	void display() {
		System.out.println("Player: "+playerName+ " ; Jersey No: "+jerseyNo);
	}
}
class CricketPlayer extends Players{
	void sportsman(String name , int no) {
		super.sportsman(name, no);
	}
}
class FootBallPlayer extends Players{
	void sportsman(String name , int no) {
		super.sportsman(name, no);
	}
}
class BasketBallPlayer extends Players{
	void sportsman(String name , int no) {
		super.sportsman(name, no);
	}
}


public class Ass1 {

	public static void main(String[] args) {
		CricketPlayer player1 = new CricketPlayer();
		CricketPlayer player2 = new CricketPlayer();
		player1.sportsman("M S Dhoni", 7);
		player2.sportsman("Virat Kohli", 18);
		player1.display();
		player2.display();
		
		FootBallPlayer player3 = new FootBallPlayer();
		FootBallPlayer player4 = new FootBallPlayer();
		player3.sportsman("Ronaldo", 7);
		player4.sportsman("Messi", 10);
		player3.display();
		player4.display();
		
		BasketBallPlayer player5 = new BasketBallPlayer();
		BasketBallPlayer player6 = new BasketBallPlayer();
		player5.sportsman("LeBron James", 37);
		player6.sportsman("Michael Jordan", 81);
		player5.display();
		player6.display();
		
	}

}

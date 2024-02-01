package com.coreDay5;

public class Sport {

	public static void main(String[] args) {
		//Player, CricketPlayer, VolleyBallPlayer, FootBallPlayer
		
		CricketPlayer c = new CricketPlayer();
		VolleyballPlayer v = new VolleyballPlayer();
		FootballPlayer f = new FootballPlayer();
		
		c.playerName("Mahendra Singh Dhoni");
		c.playerNumber(7);
		c.playerCount(11);
		
	}

}

interface Player{
	abstract void playerName();
	abstract void playerCount();
	abstract void playerNumber();
	
}

class CricketPlayer{
	public void playerName(String Name) {
		System.out.println(Name);
	}
	
	public void playerCount(int count) {
		System.out.println(count);
	}
	
	public void playerNumber(int num) {
		System.out.println(num);
	}
}

class VolleyballPlayer{
	public void playerName(String Name) {
		System.out.println(Name);
	}
	
	public void playerCount(int count) {
		System.out.println(count);
	}
	
	public void playerNumber(int num) {
		System.out.println(num);
	}
}

class FootballPlayer{
	public void playerName(String Name) {
		System.out.println(Name);
	}
	
	public void playerCount(int count) {
		System.out.println(count);
	}
	
	public void playerNumber(int num) {
		System.out.println(num);
	}
}
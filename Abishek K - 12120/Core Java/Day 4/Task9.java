package com.day4;

class CricketPlayer{
	void display() {
		System.out.println("Cricket Player are Playing cricket");
	}
}
class Batsman extends CricketPlayer{
	void display() {
		System.out.println("The Batsman are Ready for the Batting ");
	}
}
class Bowler extends Batsman{
	void display() {
		System.out.println("The Bowler are doing the bowling Pratice");
	}
}
public class Task9 {

	public static void main(String[] args) {
		CricketPlayer obj = new CricketPlayer();
		obj.display();
		CricketPlayer obj1 = new Batsman();
		obj1.display();
		CricketPlayer obj2 = new Bowler();
		obj2.display();

	}

}

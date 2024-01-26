package Java_Day_4;



class CricketPlayer1{
	void display() {
		System.out.println("Cricket Player are Playing cricket");
	}
}
class Batsman extends CricketPlayer1{
	void display() {
		System.out.println("The Batsman are Batting ");
	}
}
class Bowler extends Batsman{
	void display() {
		System.out.println("The Bowler are Bowling");
	}
}
public class CricketPlayer {

	public static void main(String[] args) {
		CricketPlayer1 obj = new CricketPlayer1();
		obj.display();
		CricketPlayer1 obj1 = new Batsman();
		obj1.display();
		CricketPlayer1 obj2 = new Bowler();
		obj2.display();

	}

}

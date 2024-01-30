package Day_4;


interface Player{
	void countOfPlayer();
}

class CricketPlayer implements Player{
	public void countOfPlayer() {
		System.out.println("Cricket has 12 Players");
	}
}

class VoleyBallPlayer implements Player{
	public void countOfPlayer() {
		System.out.println("VoleyBall has 6 Players");
	}
}

class FootBallPlayer implements Player{
	public void countOfPlayer() {
		System.out.println("FootBall has 11 Players");
	}
}
public class InterfaceClassEx2 {

	public static void main(String[] args) {
		
		Player p1 = new CricketPlayer();
		p1.countOfPlayer();
		
		Player p2 = new VoleyBallPlayer();
		p2.countOfPlayer();
		
		Player p3 = new FootBallPlayer();
		p3.countOfPlayer();
	}

	
}

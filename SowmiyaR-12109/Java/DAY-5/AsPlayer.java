package Day5;
//1. Player, CricketPlayer, VolleyBallPlayer, FootBallPlayer
abstract class player{
	abstract void Players();
}
class CricketPlayer extends player{
	void Players()
	{
		System.out.println("Cricket as 11 players");
	}
}
class VolleyBallPlayer extends player{
	void Players()
	{
		System.out.println("Volleyball as 6 players");
	}
}
class FootBallPlayer extends player{
	void Players()
	{
	   System.out.println("Football as 11 players");	
	}
}
public class AsPlayer {

	public static void main(String[] args) {
		CricketPlayer obj1=new CricketPlayer();
		obj1.Players();
		VolleyBallPlayer obj2=new VolleyBallPlayer();
		obj2.Players();
		FootBallPlayer obj3=new FootBallPlayer();
		obj3.Players();
		

	}

}

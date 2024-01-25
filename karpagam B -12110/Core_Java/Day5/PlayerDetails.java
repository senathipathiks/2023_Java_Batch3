package Com.Day5;

abstract class Player{
	 String P_name;
	 int P_Age;
	void read_Playerdetails(String P_name,int P_Age)
	{
		this.P_name=P_name;
		this.P_Age=P_Age;
		}
	void display() {
		System.out.println(" Player Name:"+P_name+"\n "+"Player Age:"+P_Age);
	}
	public Player() {
		System.out.println("let's see no of players in each Games..!!");
	}
	abstract void noOfplayers();
}
class cricketPlayer extends Player{


	@Override
	void noOfplayers() {
         System.out.println("Cricket have totally 11 players per team");		
	}
	
}
class footBallPlayer extends Player{

	@Override
	void noOfplayers() {
        System.out.println("FootBall have totally 11 players per team");		

	}
	
}
class volleyBallPlayer extends Player{

	@Override
	void noOfplayers() {
        System.out.println("volleyBall have totally 11 players per team");		
		
	}
	
}

public class PlayerDetails {

	public static void main(String[] args) {
		Player obj1 =new cricketPlayer();
		System.out.println("-------------------------------");
		obj1.read_Playerdetails("Kohli", 32);
		obj1.display();
		
		obj1.noOfplayers();

		

	    Player obj2 =new footBallPlayer();

		obj2.noOfplayers();


		
		
		
		
	}

}

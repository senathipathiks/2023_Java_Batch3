package Com.Day4;



class CricketPlayer{ 
	void noOfCricketplayer() {
		System.out.println("There are n number of cricket players..!");
	}
}

class Batsman extends CricketPlayer{ // subclass1
	void noOfBatsman() {
		System.out.println("There are n number of Batsman..!");
	}
}

class Bowler extends CricketPlayer{ // subclass2
	void noOfBowler() {
		System.out.println("There are n number of Bowlers..!");
	}
}



public class HeirarichalInheritance1 {

	public static void main(String[] args) {
		Bowler obj1=new Bowler();
		obj1.noOfCricketplayer();
		obj1.noOfBowler();
		
		Batsman obj2=new Batsman();
		obj2.noOfCricketplayer();
		obj2.noOfBatsman();
		

	}

}

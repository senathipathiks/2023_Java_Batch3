package Day_5;

import java.util.Scanner;

/*
 * Player, CricketPlayer, VolleyBallPlayer, FootBallPlayer
 */
abstract class Player{
	int pno;
	String pname,team,role;
	
	
	public Player(int pno, String pname, String team, String role) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.team = team;
		this.role = role;
	}

	abstract void details();
}

class CricketPlayer extends Player{

	public CricketPlayer(int pno, String pname, String team, String role) {
		super(pno, pname, team, role);
		
	}

	@Override
	void details() {
		System.out.println("Enter Player Jerey no : "+pno);
		System.out.println("Enter Player name : "+pname);
		System.out.println("Enter team name : "+team);
		System.out.println("Enter Role of the player : "+role);
		
	}
	
}

class VolleyBallPlayer extends Player{

	public VolleyBallPlayer(int pno, String pname, String team, String role) {
		super(pno, pname, team, role);
		// TODO Auto-generated constructor stub
	}

	@Override
	void details() {
		System.out.println("Enter Player Jerey no : "+pno);
		System.out.println("Enter Player name : "+pname);
		System.out.println("Enter team name : "+team);
		System.out.println("Enter Role of the player : "+role);
		
	}
	
}

class Football extends Player{

	public Football(int pno, String pname, String team, String role) {
		super(pno, pname, team, role);
		// TODO Auto-generated constructor stub
	}

	@Override
	void details() {
		// TODO Auto-generated method stub
		System.out.println("Enter Player Jerey no : "+pno);
		System.out.println("Enter Player name : "+pname);
		System.out.println("Enter team name : "+team);
		System.out.println("Enter Role of the player : "+role);
	}
	
}


public class GameAbs  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1.Cricket\n 2.Volleyball\n 3.Football");
		int val=sc.nextInt();
		System.out.println("Enter player jersey no");
		int no=sc.nextInt();
		System.out.println("Enter player name");
		String na=sc.next();
		System.out.println("Enter team");
		String te=sc.next();
		System.out.println("Enter role");
		String ro=sc.next();
		
		Player c=new CricketPlayer(no, na, te, ro);
		Player v=new VolleyBallPlayer(no, na, te, ro);
		Player f=new Football(no, na, te, ro);
		
		
		switch (val) {
		case 1:
			c.details();
			break;
			
		case 2:
			v.details();
			break;
			
		case 3:
			f.details();
			break;

		default:
			break;
		}
		
		
		
		
	}

}

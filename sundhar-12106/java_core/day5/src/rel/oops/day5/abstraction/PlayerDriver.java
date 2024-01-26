package rel.oops.day5.abstraction;

abstract class Player {
	String pName;
	int pAge;
	int jerseyNo;
	String role;

	public Player(String pName, int pAge, int jerseyNo) {

		this.pName = pName;
		this.pAge = pAge;
		this.jerseyNo = jerseyNo;
	}

	abstract void playerType();
}

class FootBall extends Player {

	public FootBall(String pName, int pAge, int jerseyNo, String role) {
		super(pName, pAge, jerseyNo);
		super.role = role;
	}

	@Override
	void playerType() {
		System.out.println("the player role is " + role);
	}

}

class VolleyBall extends Player {

	public VolleyBall(String pName, int pAge, int jerseyNo, String role) {
		super(pName, pAge, jerseyNo);
		super.role = role;
	}

	@Override
	void playerType() {
		System.out.println("the player role is " + role);
	}

}

class Cricket extends Player {

	public Cricket(String pName, int pAge, int jerseyNo, String role) {
		super(pName, pAge, jerseyNo);
		super.role = role;
	}

	@Override
	void playerType() {
		System.out.println("the player role is " + role);
	}

}

public class PlayerDriver {

	public static void main(String[] args) {
		
		Player cp = new Cricket("Viart", 34, 18, "Top Order Batsman");
		cp.playerType();
		
		Player vp = new VolleyBall("Hemachandran", 22, 11, "defender");
		vp.playerType();
		
		Player fb = new FootBall("Messi", 35, 7, "Attacker");
		fb.playerType();
	}

}

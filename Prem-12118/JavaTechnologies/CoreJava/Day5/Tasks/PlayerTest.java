package Day5.Tasks;

import java.util.*;

interface Player {

	public void size();
}

class VolleyBall implements Player {

	public void size() {
		System.out.println("In Volleyball there are 12 players (6+6)");
	}

}

class Cricket implements Player {
	public void size() {
		System.out.println("In Cricket there are 15 players (11+4)");
	}

}

class FootBall implements Player {
	public void size() {
		System.out.println("In foot ball there are 15 players (11+4)");
	}

}

public class PlayerTest {

	public static void main(String[] args) {

		Player obj1 = new VolleyBall();
		obj1.size();
		Player obj2 = new Cricket();
		obj2.size();
		Player obj3 = new FootBall();
		obj3.size();

	}

}
package Day5;

abstract class player{
	
	 abstract void sports();
	 abstract  void equipments();
	
}

class Cricket extends player{
	
	public Cricket() {
		System.out.println("Cricket");
		System.out.println("--------------\n");
	}

	@Override
	void sports() {
		System.out.println("each team have a 11 memebers\n");
		
	}

	@Override
	void equipments() {
		System.out.println("Equipments");
		System.out.println("1.bats\n2.balls\n3.stumps\n4.helmets\n5.pads\n6.shoes\n");
		
	}
	
}

class volleyball extends player{
	
	public volleyball() {
		System.out.println("VolleyBall");
		System.out.println("--------------\n");
	}

	@Override
	void sports() {
		System.out.println("each team have a 6 memebers\n ");
		
	}

	@Override
	void equipments() {
		System.out.println("Equipments");
		System.out.println("1.volleyball\n2.net\n3.pump\n4.shoes\n");
		
	}
	
}
class Football extends player{
	
	public Football() {
		System.out.println("Football");
		System.out.println("--------------\n");
	}
	
	

	@Override
	void sports() {
	System.out.println("each team have a 6 memebers\n");
		
	}

	@Override
	void equipments() {
		System.out.println("Equipments");
		System.out.println("1.Football\n2.net\n3.pump\\n4.shoes\n");
		
	}
	
}

public class Playerabstract {

	public static void main(String[] args) {
		
		
		Cricket c=new Cricket();
		c.sports();
		c.equipments();
		
		volleyball v=new volleyball();
		v.sports();
		v.equipments();
		
		Football f=new Football();
		f.sports();
		f.equipments();
		
		

	}

}

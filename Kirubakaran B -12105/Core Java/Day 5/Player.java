package day2oops;

abstract class play{
	abstract void rules();
	abstract void equipment();
	
}
class Cricket extends play{

	
	void rules() {
		System.out.println("In Cricket Each team wil have 11 members ");
		
	}

	@Override
	void equipment() {
		System.out.println("Bat,Ball,Stump");
		
	}
	
}
class Volleyball extends play{

	@Override
	void rules() {
		System.out.println("In Volleyball Each team will have 6 members");
		
	}

	@Override
	void equipment() {
		// TODO Auto-generated method stub
		System.out.println("Volleyball and net");
		
	}
	
}
class Football extends play{

	@Override
	void rules() {
		
		System.out.println("In football Each team wil have 11 members ");
	}

	@Override
	void equipment() {
		// TODO Auto-generated method stub
		System.out.println("Football and shoes");
		
	}
	
}
public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c=new Cricket();
		Volleyball v=new Volleyball();
		Football f=new Football();
		c.rules();
		c.equipment();
		System.out.println();
		v.rules();
		v.equipment();
		System.out.println();
		f.rules();
		f.equipment();
		
		

	}

}

package com.Day5;

abstract class Players{
	
	String name;
	String SpotsName;
	String Exp;
	long phone;
	
	abstract void displayPlayerDetails(String name,
	String SpotsName,
	String Exp,
	long phone);
	
	
}

class Cricketplayer extends Players{

	@Override
	void displayPlayerDetails(String name, String SpotsName, String Exp, long phone) {
		
		System.out.println("Player Name :"+name+
				"\nSpots Name : "+SpotsName+
				"\nExperience of Spoats :"+Exp+
				"\nPhone No :"+phone);
		
	}

	
	
	
	
}

class FoodballPlayer extends Players{

	@Override
	void displayPlayerDetails(String name, String SpotsName, String Exp, long phone) {
		
		System.out.println("Player Name :"+name+
				"\nSpots Name : "+SpotsName+
				"\nExperience of Spoats :"+Exp+
				"\nPhone No :"+phone);
		
	}
		
	}
	

class VolleyBallPlayer extends Players{

	@Override
	void displayPlayerDetails(String name, String SpotsName, String Exp, long phone) {

		System.out.println("Player Name :"+name+
				"\nSpots Name : "+SpotsName+
				"\nExperience of Spoats :"+Exp+
				"\nPhone No :"+phone);		
	}
	
}





public class Player {

	public static void main(String[] args) {
		
		
		Players c = new Cricketplayer();
		Players f =new FoodballPlayer();
		Players v = new VolleyBallPlayer();
		
		c.displayPlayerDetails("Sathya", "Cricket", "1 Year", 987564534);
		System.out.println("____________________________________________");
		
		f.displayPlayerDetails("Vishnu","Football", "2 Years", 34768687);
		
		System.out.println("____________________________________________");
		
		v.displayPlayerDetails("Sanjay", "VolleyBall", "3 Years", 23452525);
	}

}

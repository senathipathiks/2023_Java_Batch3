package com.day11;

interface Flyable{															//Interface Declaration
	 void flyObj() ;
		
	}

class SpaceCraft implements Flyable{										//Implementation of interface
	public void flyObj() {
		System.out.println("This is a SpaceCraft,Fly over space...");
	}
}

class Aeroplane implements Flyable{											//Implementation of interface
	public void flyObj() {
		System.out.println("This is a Aeroplane,Fly over sky...");
	}
}

class Helicopter implements Flyable{										//implementation of interface
	public void flyObj() {
		System.out.println("This is a Helicopter,Fly over sky...");
	}
}

public class InterfaceFlyable {

	public static void main(String[] args) {
		Flyable spaceCraft = new SpaceCraft();								//DMD Dynamic method dispatch 
		spaceCraft.flyObj();
		Flyable aeroplane = new Aeroplane();
		aeroplane.flyObj();
		Flyable helicopter = new Helicopter();
		helicopter.flyObj();
	}

}

package com.day4;

class CricketPlayer{
	void player () {
		System.out.println("He is Cricket player");
	}
}

class Batsman extends CricketPlayer{
	@Override
	void player() {
		System.out.println("He is a Batsman");
	}
}

public class Cricket {

	public static void main(String[] args) {
		

	}

}

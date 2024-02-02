package com.day10;

class Sport{
	void play() {
		System.out.println("Sports give discipline");
	}
}

class Football extends Sport{
	void play() {
		System.out.println("Football is played by Legs,Semi-Contacted Sport");
	}
}

class Basketball extends  Sport{
	void play() {
		System.out.println("Basketball is played by Hands, Semi-Contacted sport ");
	}
}

class Rugby extends Sport{
	void play() {
		System.out.println("Rugby is played by Both legs & hands , Full-Contacted Sport");
	}
}



public class MainClass5 {

	public static void main(String[] args) {
		Sport football = new Football();
		football.play();
		
		Sport basketball = new Basketball();
		basketball.play();
		
		Sport rugby = new Rugby();
		rugby.play();

	}

}

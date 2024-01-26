package com.day5;

abstract class Player{
	String Pname;
	String Pcountry;
	int age;
	String role;
	Player() {
		
	}
	Player(String name,String cnt,int ag,String rle){
		Pname=name;
		Pcountry=cnt;
		age=ag;
		role=rle;
	}
	abstract void display();
}
class CricketPlayer extends Player{
	CricketPlayer(){
		super("Abishek","India",25,"Fielder");
	}
	void display() {
		System.out.println("********Cricket Player**********");
		System.out.println("Player Name: "+Pname);
		System.out.println("Player Country: "+Pcountry);
		System.out.println("Player Age: "+age);
		System.out.println("Player Role: "+role);
	}
}
class Volleyball extends CricketPlayer{
	Volleyball() { }
	Volleyball(String nm,String ct,String po,int ag){
		Pname=nm;
		Pcountry=ct;
		role=po;
		age=ag;
		
	}
	void display() {
		System.out.println("********Volleyball Player*********");
		System.out.println("Player Name: "+Pname);
		System.out.println("Player Country: "+Pcountry);
		System.out.println("Player Age: "+age);
		System.out.println("Player Role: "+role);
	}
}
class Football extends Volleyball{
	Football(String nm,String ct,String po,int ag){
		Pname=nm;
		Pcountry=ct;
		role=po;
		age=ag;
		
		
		
	}
	void display() {
		System.out.println("********Football Player*********");
		System.out.println("Player Name: "+Pname);
		System.out.println("Player Country: "+Pcountry);
		System.out.println("Player Age: "+age);
		System.out.println("Player Role: "+role);
	}
}
public class Task1 {

	public static void main(String[] args) {
		Player obj = new CricketPlayer();
		obj.display();
		Player obj1 = new Volleyball("Sachin","India","Defender",52);
		obj1.display();
		Player obj2 = new Football("Ronaldo","Germany","Keeper",47);
		obj2.display();

	}

}

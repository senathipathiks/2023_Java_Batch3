package Day_4;

import java.util.Scanner;

class Veh{
	void wheel() {
		System.out.println("Vehicle run through wheels");
	}
	void engine() {
		System.out.println("Engine is must for vehicle");
	}
}

class TwoWheeler extends Veh{
	void wheel() {
		System.out.println("Two wheelers run through 2 wheels");
	}
	void engine() {
		System.out.println("Engine is must for two wheeler");
	}
}

class FourWheeler extends TwoWheeler{
	void wheel() {
		System.out.println("Four wheelers run through 4 wheels");
	}
	void engine() {
		System.out.println("Engine is must for four wheeler");
	}
}

public class Vehicle {

	public static void main(String[] args) {
		Veh vehicle=new Veh();
		Veh twowheeler=new TwoWheeler();
		Veh fourwheeler=new FourWheeler();
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1.vehicle\n 2.twowheeler\n 3.fourwheeler");
		int val=sc.nextInt();
		
		switch (val) {
		case 1:
			vehicle.wheel();
			vehicle.engine();
			break;
			
		case 2:
			twowheeler.wheel();
			twowheeler.engine();
			break;
			
		case 3:
			fourwheeler.wheel();
			fourwheeler.engine();
			break;

		default:
			break;
		}
		

	}

}

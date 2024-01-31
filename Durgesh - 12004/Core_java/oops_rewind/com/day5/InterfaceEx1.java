package com.day5;
interface Vehicle{
	public abstract void brand();
}
class bike implements Vehicle{
	public void brand() {
		System.out.println("Honda");
	}
}
class car implements Vehicle{
	public void brand() {
		System.out.println("Mahindra");
	}
}
class truck implements Vehicle{
	public void brand() {
		System.out.println("Ashok Leyland");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		Vehicle obj1 = new bike();
		obj1.brand();
				
	}

}

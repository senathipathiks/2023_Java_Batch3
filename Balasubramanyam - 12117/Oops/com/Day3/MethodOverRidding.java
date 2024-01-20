package com.Day3;
class Bank{
	void interest() {
		System.out.println(0);
	}
}
class Hdfc extends Bank{
	void interest() {                            //we cant overridde 
		System.out.println(3);
	}
}
class IcIc extends Bank{
	void interest() {
		System.out.println(5);
	}
}
public class MethodOverRidding {

	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		IcIc ic = new IcIc();
		h.interest();
		ic.interest();

	}

}

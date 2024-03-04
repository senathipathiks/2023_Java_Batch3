package com.oops1;

class MobilePhone{
	String brandName;
	float price;
	//constructor
	//if the constructor variable is declared same as class variable declaration it will return null
	MobilePhone(String brand,float p){
		this.brandName = brand;
		this.price = p;
	}
	void display() {
		System.out.println("brand name :"+brandName);
		System.out.println("price:" + price);
	}
	}


public class MainClass {
	public static void main(String[] args) {
		MobilePhone samsung = new MobilePhone("Samsung",10000.0f);
		samsung.display();
		
		MobilePhone nokia = new MobilePhone("Nokia",8000.0f);
		nokia.display();
		
	}

}

package com.oops.day1;

class Details{
	String brandName;
	float price;
		

	//constructor
	public Details(String bName, float mprice) {
		brandName = bName;
		price = mprice;
	}
		
	void display() {
		System.out.println("Brand name is : "+brandName);
		System.out.println("Price is : "+price);	
	}
}


public class MobDetails {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Details samsung=new Details("Samsung", 50000);
		Details apple=new Details("Apple", 55000);
		Details nokia=new Details("Nokia", 20000);
		samsung.display();
		apple.display();
		nokia.display();
	}
}

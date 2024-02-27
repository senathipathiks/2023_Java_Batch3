package com.oops.day1;

class MobileName2 {

	String brandName;
	float price;
		

	//constructor
	public MobileName2(String brandName, float price) {
		this.brandName = brandName;
		this.price = price;
	}
		
	void display() {
		System.out.println("Brand name is : "+brandName);
		System.out.println("Price is : "+price);	
	}
}


public class Mobile2 {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Details samsung=new Details("Samsung", 50999);
		Details apple=new Details("Apple", 54999);
		Details nokia=new Details("Nokia", 19999);
		samsung.display();
		apple.display();
		nokia.display();
	}

}

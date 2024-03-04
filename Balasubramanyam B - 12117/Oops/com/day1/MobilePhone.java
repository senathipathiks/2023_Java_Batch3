package com.day1;

public class MobilePhone {
//	variables
	String brandname;
	float price;
//	constructors
	MobilePhone(String brandname ,float price){
		this.brandname=brandname;
		this.price=price;
	}
//	method
	public	void display() {
			System.out.println("\nBrandName: "+brandname);
			System.out.println("price: "+price);
		}
	
	public static void main(String[] args) {
		MobilePhone samsung=new MobilePhone("Samsung",20000); 
		samsung.display();
		MobilePhone redmi=new MobilePhone("Redmi",10000); 
		redmi.display();
	}

}

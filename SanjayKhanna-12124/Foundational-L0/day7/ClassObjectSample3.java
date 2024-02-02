package com.day7;

class Mobile{
	//Variable
		String brandName;
		float price;
		
			//Constructor
		
		 public Mobile(String brandName,float price) {
			 this.brandName=brandName;
			 this.price=price;
			
		}

		 
		 void display() {
			 System.out.println("---------------------------");
			 System.out.println("Brand Name : "+brandName);
			 System.out.println("Price : "+this.price+"rs");
			 System.out.println("---------------------------\n");

		 }
}

public class ClassObjectSample3 {
	public static void main(String[] args) {
		Mobile vivo = new Mobile("ViVo", 15999.00f);
		vivo.display();
		
		Mobile samsung = new Mobile("Samsung", 14999.00f);
		samsung.display();
		
		Mobile oppo = new Mobile("Oppo", 13999.00f);
		oppo.display();
	}
}


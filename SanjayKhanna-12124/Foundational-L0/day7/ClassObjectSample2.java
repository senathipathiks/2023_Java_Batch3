package com.day7;

class MobilePhone{
	//Variable
	String brandName;
	float price;
	
		//Constructor
	
	 public MobilePhone(String brand,float p) {
		 super();
		 brandName=brand;
		 price=p;
		
	}
	 
	 void display() {
		 System.out.println("---------------------------");
		 System.out.println("Brand Name : "+brandName);
		 System.out.println("Price : "+price+"rs");
		 System.out.println("---------------------------\n");

	 }
}
public class ClassObjectSample2 {

	public static void main(String[] args) {
		MobilePhone vivo = new MobilePhone("ViVo", 15999.00f);
		vivo.display();
		
		MobilePhone samsung = new MobilePhone("Samsung", 14999.00f);
		samsung.display();
		
		MobilePhone oppo = new MobilePhone("Oppo", 13999.00f);
		oppo.display();
	}

}

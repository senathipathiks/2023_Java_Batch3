package com.code.facade;


//implementation class

public class Apple implements MobileShop {

	@Override
	public void model() {

		//Available mobiles in the shop
		
		System.out.println("Iphone 15 pro max");

	}

	@Override
	public void price() {
		
		// Price of the mobiles
		
		System.out.println(" Rs 125000.00 ");
	}
	
	

}

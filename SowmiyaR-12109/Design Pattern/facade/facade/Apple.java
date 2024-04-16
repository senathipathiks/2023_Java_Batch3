package com.code.facade;


//implementation class

public class Apple implements MobileShop {

	@Override
	public void model() {

		System.out.println("Iphone 14");
		System.out.println("Iphone 14 pro");
		System.out.println("Iphone 14 pro max");
		System.out.println("Iphone 15");
		System.out.println("Iphone 15 pro");
		System.out.println("Iphone 15 pro max");

	}

	@Override
	public void price() {
		System.out.println(" Rs 50000.00 ");
		System.out.println(" Rs 55000.00 ");
		System.out.println(" Rs 60000.00 ");
		System.out.println(" Rs 65000.00 ");
		System.out.println(" Rs 70000.00 ");
		System.out.println(" Rs 75000.00 ");
		System.out.println(" Rs 80000.00 ");
	}
	
	

}

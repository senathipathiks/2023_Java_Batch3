package com.code.facade;

public class Samsung implements MobileShop {

	@Override
	public void model() {
		
		//Available mobiles in the shop

		System.out.println(" Galaxy S24 ultra ");

	}

	@Override
	public void price() {
		
		// Price of the mobiles

		System.out.println(" Rs 75000.00 ");
	}

}

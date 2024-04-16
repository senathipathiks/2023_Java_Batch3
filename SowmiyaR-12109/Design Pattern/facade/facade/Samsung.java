package com.code.facade;

public class Samsung implements MobileShop {

	@Override
	public void model() {
		System.out.println(" Galaxy S23 ");
		System.out.println(" Galaxy S23 ultra");
		System.out.println(" Galaxy S24 ");
		System.out.println(" Galaxy S24 ultra ");

	}

	@Override
	public void price() {
		 System.out.println(" Rs 45000.00 ");
		 System.out.println(" Rs 50000.00 ");
		 System.out.println(" Rs 55000.00");
		 System.out.println(" Rs 60000.00 ");
	}

}

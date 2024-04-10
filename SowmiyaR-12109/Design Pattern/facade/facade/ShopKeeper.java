package com.code.facade;

//concrete class

public class ShopKeeper {

	private MobileShop apple;
	private MobileShop samsung;
	
	
	public ShopKeeper() {
		apple=new Apple();
		samsung=new Samsung(); 
		
	}
	
	public void appleSale() {
		apple.model();
		apple.price();
	}
	
	public void samsungSale() {
		samsung.model();
		samsung.price();
	}
	
}

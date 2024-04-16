package com.code.facade;

//concrete class

public  class ShopKeeper implements ShopkeeperInterface{
	
	//Clients don’t need to know the inner workings;
	//they interact with the facade, which handles the intricacies or complexities behind the scenes.

	private MobileShop apple;
	private MobileShop samsung;
	
	
	public ShopKeeper() {
		apple=new Apple();
		samsung=new Samsung(); 
		
	}


	@Override
	public void appleSale() {
		apple.model();
		apple.price();
	
	}


	@Override
	public void samsungSale() {
		samsung.model();
		samsung.price();
	}
	
	
	
}

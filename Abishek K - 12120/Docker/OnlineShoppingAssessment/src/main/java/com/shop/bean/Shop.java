package com.shop.bean;

public class Shop {

	int shopID;
	String shopName;
	String shopLoc;
	String shopPh;
	
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shop(int shopID, String shopName, String shopLoc, String shopPh) {
		super();
		this.shopID = shopID;
		this.shopName = shopName;
		this.shopLoc = shopLoc;
		this.shopPh = shopPh;
	}

	public int getShopID() {
		return shopID;
	}

	public void setShopID(int shopID) {
		this.shopID = shopID;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopLoc() {
		return shopLoc;
	}

	public void setShopLoc(String shopLoc) {
		this.shopLoc = shopLoc;
	}

	public String getShopPh() {
		return shopPh;
	}

	public void setShopPh(String shopPh) {
		this.shopPh = shopPh;
	}
	
	
	
}

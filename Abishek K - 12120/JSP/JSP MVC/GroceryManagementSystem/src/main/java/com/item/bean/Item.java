package com.item.bean;

public class Item {

	int itemID;
	String itemName;
	double itemPrice;
	String itemSeller;
	String itemBuyer;
	String itemStatus;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int itemID, String itemName, double itemPrice, String itemSeller, String itemBuyer, String itemStatus) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemSeller = itemSeller;
		this.itemBuyer = itemBuyer;
		this.itemStatus = itemStatus;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemSeller() {
		return itemSeller;
	}
	public void setItemSeller(String itemSeller) {
		this.itemSeller = itemSeller;
	}
	public String getItemBuyer() {
		return itemBuyer;
	}
	public void setItemBuyer(String itemBuyer) {
		this.itemBuyer = itemBuyer;
	}
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	
	
}

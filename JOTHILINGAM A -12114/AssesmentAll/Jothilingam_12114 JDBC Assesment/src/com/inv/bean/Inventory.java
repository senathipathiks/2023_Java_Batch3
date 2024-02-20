package com.inv.bean;

public class Inventory {
	
	private int itemID;
	private String itemName;
	private int Quantity_Available;
	private String Manufacturer;
	private String Mfg_date;
	private Float Price;
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}
	
	public Inventory(int itemID, String itemName, int quantity_Available, String manufacturer, String mfg_date,
			Float price) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		Quantity_Available = quantity_Available;
		Manufacturer = manufacturer;
		Mfg_date = mfg_date;
		Price = price;
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
	public int getQuantity_Available() {
		return Quantity_Available;
	}
	public void setQuantity_Available(int quantity_Available) {
		Quantity_Available = quantity_Available;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getMfg_date() {
		return Mfg_date;
	}
	public void setMfg_date(String mfg_date) {
		Mfg_date = mfg_date;
	}
	public Float getPrice() {
		return Price;
	}
	public void setPrice(Float price) {
		Price = price;
	}
}

package com.emp.bean;

public class Inventory {

	private int itemId;
	private String itemName;
	private String quantityStock;
	private String manufacturer;
	private String mfgDate;
	private float price;
	
	public Inventory() {
		super();
	}

	public Inventory(int itemId, String itemName, String quantityStock, String manufacturer, String mfgDate, float price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantityStock = quantityStock;
		this.manufacturer = manufacturer;
		this.mfgDate = mfgDate;
		this.price = price;
	}
	
	public Inventory(int itemId,float price) {
		super();
		this.itemId=itemId;
		this.price=price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(String quantityStock) {
		this.quantityStock = quantityStock;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

package com.oss.bean;

public class OnlineShopping {
	
	int ProductId;
	String ProductName;
	int Quantity;
	int Price;
	public OnlineShopping() {
		
	}
	public int getProductId() {
		return ProductId;
	}
	
	
	
	public OnlineShopping(int productId, String productName, int quantity, int price) {
		super();
		ProductId = productId;
		ProductName = productName;
		Quantity = quantity;
		Price = price;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
	

}
